package it.trian.stage.shopcart;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
/**
 * @author Nicholas Antinori 
 * @author Mario Andrei Cojocaru 
 * questa classe contiene tutti i metodi che serviranno all'articolo di essere aggiunto rimosso o modificato nel carrello stampando inoltre anche lo stesso carrello finale con le eventuali modifiche apportate
 * @version 1.5
 */
public class CartList{
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(CartList.class);
	private List<Articolo> articoli = new ArrayList<Articolo>();


	public List<Articolo> getArticoli() {

		return articoli;
	}

	public void setArticoli(List<Articolo> articoli) {
		this.articoli = articoli;
	}

	public Articolo aggiungiProdotto(long id, long quantita) { // metodo di istanza per l'aggiunta di un prodotto nel
																// carrello
		boolean trovato = false;
		Articolo articolo = null;
		if (quantita == 0) {
			throw new RuntimeException("la quantita non può essere 0");
		}
		if (quantita < 0) {
			throw new RuntimeException("la quantita non può essere negativa");
		}

		for (Articolo elemento : articoli) { // si scorre tutta la lista e se l'id passato è già presente ne aumenta la
												// quantità
			if (id == elemento.getIdProdotto()) {
				long qTmp = elemento.getQuantity() + quantita;
				elemento.setQuantityy(qTmp);
				articolo = elemento;
				trovato = true;
				break;
			}
		}
		if (!trovato) { // se l'id non è presente viene creato l'oggetto
			articolo = new Articolo(id, quantita);
			articoli.add(articolo);
		}
		return articolo;
	}

	public void removeAll(long id) {
		int index = 0;
		for (Articolo articolo : articoli) {
			if (id == articolo.getIdProdotto()) {
				LOG.info("il Prodotto e stato rimosso completamente");
				System.out.println(" ");
				index = articoli.indexOf(articolo);
				articoli.remove(index);
				break;
			}
		}

	}

	public void rimuoviProdotto(long id) {
		boolean trovato = false;
		int index = 0;
		long quantita = 0;
		for (Articolo articolo : articoli) {
			if (id == articolo.getIdProdotto()) {
				LOG.info("Prodotto Rimosso");
				index = articoli.indexOf(articolo);
				trovato = true;
				quantita = articolo.getQuantity();
				break;
			}
		}
		if (trovato) {
			if (quantita == 1) {
				articoli.remove(index);
			} else {
				quantita--;
				articoli.get(index).setQuantityy(quantita);
			}
		}
	}

	public void modifyProdotto(long id, long quantity) {
		if (quantity == 0) {
			throw new RuntimeException("la quantita non può essere 0");
		}
		if (quantity < 0) {
			throw new RuntimeException("la quantita non può essere negativa");
		}
		for (Articolo articolo : articoli) {
			if (id == articolo.getIdProdotto()) {
				articolo.setQuantityy(quantity);
				break;
			}
		}
	}

	public void stampaCarrello() {
		LOG.info("-----Carrello Attuale------");
		System.out.println(" ");
		for (Articolo Item : articoli) {
			Item.stampaArticolo();
			System.out.println("-----------------");
		}
	}
}
