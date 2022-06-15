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
	private HashMap <Integer,Prodotto> catalogo = new HashMap<Integer,Prodotto>();// Dichiarazione dell'array list di tipo Prodotti
																		// con al suo interno tutti i prodotti elencati
	/*{
		catalogo.put(1,new Prodotto(1, "Tavolino", "Solido"));
		catalogo.put(2,new Prodotto(2, "Sgabello", "Scomodo"));
		catalogo.put(3,new Prodotto(3, "Armadio", "Capiente"));
		catalogo.put(4,new Prodotto(4, "Cassettiera", "Organizzata"));
		catalogo.put(5,new Prodotto(5, "Specchio", "Riflettente"));
		catalogo.put(6,new Prodotto(6, "Doccia", "Rilassante"));
		catalogo.put(7,new Prodotto(7, "Puff", "Morbido"));
		catalogo.put(8,new Prodotto(8, "Divano", "Cadduso"));
		catalogo.put(9,new Prodotto(9, "Sedia", "Robsta"));
		catalogo.put(10,new Prodotto(10, "Frigorifero", "Fresco"));
		catalogo.put(11,new Prodotto(11, "Stamapante", "Rumorosa"));
		catalogo.put(12,new Prodotto(12, "Condizionatore", "Brr Brr"));
		catalogo.put(13,new Prodotto(13, "Turbina", "Stutututu"));
		catalogo.put(14,new Prodotto(14, "Letto", "Comodo"));
	}
		*/
	//int cont;
	
	public void addprodotto(int cont,String nome , String descrizione) {
		
		catalogo.put(cont,new Prodotto(cont, nome, descrizione));
	}
	
	public void removeprodotto(int cont) {
		catalogo.remove(cont);
		System.out.println(catalogo);
	}
	
	public void modificaproduct(int cont,String nome, String descrizione) {
		catalogo.replace(cont, new Prodotto(cont,nome,descrizione));
		System.out.println(catalogo);
	}
	
	public void stampaCatalogo() { // metodo di stampa dedicato al catalogo
		for (Prodotto prodotto  : catalogo.values()) {
			prodotto.stampa();
			LOG.info(" ");
		}
	}
}
