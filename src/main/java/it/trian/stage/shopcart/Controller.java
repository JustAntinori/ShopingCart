package it.trian.stage.shopcart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nicholas Antinori & Mario Andrei Cojocaru Servizio Web di un carrello
 *         acquisti realizzato con un server API (Application Programming
 *         Interface) REST la quale non è altro che un'Interfaccia di
 *         Programmazione delle Applicazioni
 */

@RestController
@RequestMapping()
public class Controller {
	CartList carrello = new CartList();
	Magazzino catalogo = new Magazzino();

	@GetMapping("/list")
	public void lista() {
		catalogo.stampaCatalogo();
	}

	@PostMapping("/add")
	public void aggiungi(long id, long quantita) {
		carrello.aggiungiProdotto(id, quantita);
		System.out.println("Prodotto Aggiunto correttamente");
		System.out.println("----------------");
		carrello.stampaCarrello();
	}

	@GetMapping("/cart")
	public void listaCarrello() {
		carrello.stampaCarrello();
	}

	@PostMapping("/mod")
	public void modifica(long id, long quantita) {
		carrello.modifyProdotto(id, quantita);
		System.out.println("Prodotto Modificato correttamente");
	}

	@DeleteMapping("/del")
	public void rimuovi(long id) {
		carrello.rimuoviProdotto(id);
	}

	@DeleteMapping("/delall")
	public void rimuovitutto(long id) {
		carrello.removeAll(id);
	}

}
