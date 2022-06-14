package it.trian.stage.shopcart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShopcartApplicationTests {
	CartList carrello = new CartList();
	Magazzino cat = new Magazzino();

	/**
	 * Questo Test Aggiunge dei prodotti ad un carrello vuoto
	 */
	@Test
	public void TestAggiungiProdotto1() {
		int count=0;
			cat.stampaCatalogo();
		
		System.out.println(" ");
		System.out.println("--Fine Catalogo--");
		carrello.aggiungiProdotto(1, 5);
		count++;
		carrello.aggiungiProdotto(2, 2);
		count++;
		carrello.aggiungiProdotto(3, 2);
		count++;
		carrello.aggiungiProdotto(4, 5);
		count++;
		carrello.aggiungiProdotto(5, 3);
		count++;
		carrello.aggiungiProdotto(6, 2);
		count++;
		carrello.aggiungiProdotto(7, 1);
		count++;
		carrello.stampaCarrello();
		assert (carrello.getArticoli().size() == count);
	}

	/**
	 * Questo Test lavora con due prodotti con stesso id ma quantità diverse
	 */
	@Test
	public void TestAggiungiProdotto2() {
		int index=0;
		int q1=0;
		int q2=0;
		cat.stampaCatalogo();
		System.out.println(" ");
		System.out.println("--Fine Catalogo--");
		q1 = 5;
		Articolo articolo=carrello.aggiungiProdotto(1, q1);
		index=carrello.getArticoli().indexOf(articolo);
		q2 = 2;
		articolo=carrello.aggiungiProdotto(1, q2);
	q1+=q2;
		
		carrello.aggiungiProdotto(2, 2);
		carrello.stampaCarrello();
		assert (carrello.getArticoli().get(index).getQuantity()==q1);
	}
	
	
	@Test
	public void TestAggiungiProdotto3() {
		cat.stampaCatalogo();
		System.out.println(" ");
		System.out.println("--Fine Catalogo--");
		carrello.aggiungiProdotto(1, 0);
		carrello.stampaCarrello();
		assert (carrello.getArticoli().get(0).getQuantity() == 0);
	}

	/**
	 * Questo test decrementa la quantità di un prodotto presente nel carrello
	 */
	@Test
	public void TestRimuoviProdotto1() {

		cat.stampaCatalogo();
		System.out.println(" ");
		System.out.println("--Fine Catalogo--");
		carrello.aggiungiProdotto(1, 5);
		carrello.aggiungiProdotto(1, 2);
		carrello.rimuoviProdotto(1);
		carrello.stampaCarrello();
		assert (carrello.getArticoli().get(0).getQuantity()==6);
	}

	/**
	 * Questo test rimuove un prodotto presente nel carrello quando la sua quantità
	 * è minore di 1
	 */
	@Test
	public void TestRimuoviProdotto2() {
    
		cat.stampaCatalogo();
		System.out.println(" ");
		System.out.println("--Fine Catalogo--");
		carrello.aggiungiProdotto(1,1);
		carrello.rimuoviProdotto(1);
		
	}
	
	
	/**
	 * Questo test modifica la quantità di un prodotto presente nel carrello 
	 */
	@Test
	public void TestModificaProdotto1() {
		cat.stampaCatalogo();
		System.out.println(" ");
		System.out.println("--Fine Catalogo--");
		
		carrello.aggiungiProdotto(5,1);
		carrello.stampaCarrello();
		carrello.modifyProdotto(5,8);
		carrello.stampaCarrello();
	}
	
	
}


