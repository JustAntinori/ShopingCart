package it.trian.stage.shopcart;

import java.util.HashMap;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;

/**
 * @author Nicholas Antinori & Mario Andrei Cojocaru questa classe contiene
 *         tutti gli oggetti presenti nel catalogo
 */

public class Magazzino {
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Magazzino.class);
	private HashMap<Integer, Prodotto> catalogo = new HashMap<Integer, Prodotto>();// Dichiarazione dell'array map di
																					// tipo Prodotti

	// metodo di aggiunta di un prodotto al catalogo
	public void addprodotto(int cont, String nome, String descrizione) {

		catalogo.put(cont, new Prodotto(cont, nome, descrizione));
		LOG.info("Prodotto Aggiunto Dal Catalogo");
	}

	// metodo per la rimozione di un prodotto nel catalogo
	public void removeprodotto(int cont) {
		catalogo.remove(cont);
		System.out.println(catalogo);
		LOG.info("Prodotto Rimosso Dal Catalogo");
	}

	// metodo che modifica un prodotto nel catalogo
	public void modificaproduct(int cont, String nome, String descrizione) {
		catalogo.replace(cont, new Prodotto(cont, nome, descrizione));
		System.out.println(catalogo);
		LOG.info("Prodotto Modificato Dal Catalogo");
	}

	public void stampaCatalogo() { // metodo di stampa dedicato al catalogo
		for (Prodotto prodotto : catalogo.values()) {
			prodotto.stampa();
			LOG.info(" ");
		}
	}
}
