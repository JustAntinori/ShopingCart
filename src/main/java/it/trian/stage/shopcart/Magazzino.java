package it.trian.stage.shopcart;

import java.util.ArrayList;

/**
 * @author Nicholas Antinori & Mario Andrei Cojocaru questa classe contiene
 *         tutti gli oggetti presenti nel catalogo
 */

public class Magazzino {
	private int totale;
	Articolo elemento = new Articolo(0, 0);
	private ArrayList<Prodotto> catalogo = new ArrayList<Prodotto>();// Dchiarazione dell'array list di tipo Prodotti
																		// con al suo interno tutti i prodotti elencati
	{

		catalogo.add(new Prodotto(1, "Tavolino", "Solido"));
		catalogo.add(new Prodotto(2, "Sgabello", "Scomodo"));
		catalogo.add(new Prodotto(3, "Armadio", "Capiente"));
		catalogo.add(new Prodotto(4, "Cassettiera", "Organizzata"));
		catalogo.add(new Prodotto(5, "Specchio", "Riflettente"));
		catalogo.add(new Prodotto(6, "Doccia", "Rilassante"));
		catalogo.add(new Prodotto(7, "Puff", "Morbido"));
		catalogo.add(new Prodotto(8, "Divano", "Cadduso"));
		catalogo.add(new Prodotto(9, "Sedia", "Robsta"));
		catalogo.add(new Prodotto(10, "Frigorifero", "Fresco"));
		catalogo.add(new Prodotto(11, "Stamapante", "Rumorosa"));
		catalogo.add(new Prodotto(12, "Condizionatore", "Brr Brr"));
		catalogo.add(new Prodotto(13, "Turbina", "Stutututu"));
		catalogo.add(new Prodotto(14, "Letto", "Comodo"));

	}

	public void controllo(int id) { // metodo per il controllo tramite id se il prodotto è presente nel catalogo

		for (Prodotto prova : catalogo) {
			prova.getId();
			if (id == prova.getId()) {
				prova.stampa();
				break;
			}

		}

	}

	public void stampaCatalogo() { // etodo di stampa dedicato al catalogo ricevendo come parametro un indice o un
									// id preciso

		for (Prodotto Item : catalogo) {
			Item.stampa();
			System.out.println(" ");
			continue;

		}
	}
}
