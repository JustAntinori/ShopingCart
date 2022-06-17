package it.trian.stage.shopcart;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

/**
 *
 *  Servizio Web di un carrello
 * acquisti realizzato con un server API (Application Programming
 *  Interface) REST la quale non è altro che un'Interfaccia di
 *  Programmazione delle Applicazioni(Controller che permette la gestione del carrello)
 *  
 *  @author Nicholas Antinori 
 * 	@author Mario Andrei Cojocaru 
 * @version 1.4
 */

@RestController
@RequestMapping("/carrello")
public class Controller {
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Magazzino.class);
	CartList carrello = new CartList();
	@Autowired()
	private Magazzino magazzino;

	@GetMapping("/lista")
	public HashMap lista() {
		return magazzino.getCatalogo();
	}

	@PostMapping("/aggiungi")
	public void aggiungi(int id, long quantita) {
		boolean controllo;
		controllo=magazzino.controllo(id);
		if(controllo==true) {
			carrello.aggiungiProdotto(id, quantita);
			LOG.info("Prodotto Aggiunto Correttamente");
		} 
	}

	@GetMapping("/stampa")
	public List listaCarrello() {
		return carrello.getArticoli();
	}

	@PostMapping("/modifica")
	public void modifica(long id, long quantita) {
		carrello.modifyProdotto(id, quantita);
		LOG.info("Prodotto Modificato correttamente");
	}

	@DeleteMapping("/rimuovi")
	public void rimuovi(long id) {
		carrello.rimuoviProdotto(id);
	}

}
