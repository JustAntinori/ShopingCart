package it.trian.stage.shopcart;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nicholas Antinori 
 * @author Mario Andrei Cojocaru 
  
 * @apiNote Servizio Web di un carrello
 * acquisti realizzato con un server API (Application Programming
 *  Interface) REST la quale non è altro che un'Interfaccia di
 *  Programmazione delle Applicazioni(Controller che permette la gestione del carrello)
 *  @version 1.4
 */

@RestController
@RequestMapping("/carrello")
public class Controller {
	CartList carrello = new CartList();
	@Autowired()
	private Magazzino magazzino;

	@GetMapping("/listaProdotti")
	public HashMap lista() {
		return magazzino.getCatalogo();
	}

	@PostMapping("/aggiungiProdotto")
	public void aggiungi(long id, long quantita) {
		carrello.aggiungiProdotto(id, quantita);
		System.out.println("Prodotto Aggiunto correttamente");
		System.out.println("----------------");
		carrello.stampaCarrello();
	}

	@GetMapping("/stampaCarrello")
	public List listaCarrello() {
		return carrello.getArticoli();
	}

	@PostMapping("/modificaProdotto")
	public void modifica(long id, long quantita) {
		carrello.modifyProdotto(id, quantita);
		System.out.println("Prodotto Modificato correttamente");
	}

	@DeleteMapping("/rimuoviProdotto")
	public void rimuovi(long id) {
		carrello.rimuoviProdotto(id);
	}

}
