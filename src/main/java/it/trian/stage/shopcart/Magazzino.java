package it.trian.stage.shopcart;

import java.util.HashMap;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;

/**
 * @author Nicholas Antinori
 * @author Mario Andrei Cojocaru 
 * @apiNote questa classe permette di aggiungere
 *         all'interno di un catalogo un prodotto tramite parametri id,nome e
 *         descrizione
 * @version 1.6
 */
@Repository("magazzino")
public class Magazzino {
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Magazzino.class);
	private HashMap<Integer, Prodotto> catalogo = new HashMap<Integer, Prodotto>();// Dichiarazione dell'array map di
	private int contatore=0;

	public HashMap<Integer, Prodotto> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(HashMap<Integer, Prodotto> catalogo) {
		this.catalogo = catalogo;
	}

	// metodo di aggiunta di un prodotto al catalogo
	public void addprodotto(int id, String nome, String descrizione) {
		if (!catalogo.containsKey(id)) {
			catalogo.put(id, new Prodotto(id, nome, descrizione));
			LOG.info("Prodotto Aggiunto al Catalogo");
		}else {
			throw new RuntimeException("L'ID e' gia' associato ad un prodotto");
		}
		
	}

	// metodo per la rimozione di un prodotto nel catalogo
	public int removeprodotto(int id) {
		Prodotto prod = null;
		int tempId = 0;
		prod = catalogo.remove(id);
		if (prod != null) {
			LOG.info("Prodotto Rimosso Dal Catalogo");
			tempId = id;
		} else {
			tempId = -1;
			LOG.info("Il prodotto non è stato rimosso");
		}
		return tempId;
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
