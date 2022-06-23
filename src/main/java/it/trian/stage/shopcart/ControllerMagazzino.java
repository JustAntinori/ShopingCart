package it.trian.stage.shopcart;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 *  Servizio Web di un carrello
 * acquisti realizzato con un server API (Application Programming
 * Interface) REST la quale non è altro che un'Interfaccia di
 * Programmazione delle Applicazioni(Controller per la gestione del magazzino)
 * @author Nicholas Antinori 
 * @author Mario Andrei Cojocaru 
 * @version 1.2
 */

@RestController
@RequestMapping("/magazzino")
public class ControllerMagazzino {
	
	@Autowired()
	private Magazzino magazzino;
	
	@PostMapping("/aggiungi")//aggiunge un prodotto nel catalogo
	public void aggiungiCatalogo(int id, String nome,@RequestParam(required=true) String descrizione) {
		 magazzino.addProdotto(id, nome, descrizione);
		
	}

	
	/**
	 * @param id
	 * @return id se ok,altrimenti -1 
	 */
	@DeleteMapping("/rimuovi")		//rimuove un prodotto nel catalogo
	public int rimuoviProdotto(int id) { 
		int temp=0;
		temp=magazzino.removeProdotto(id);
		return temp;
	}

	@PostMapping("/modifica")//modifica un prodotto nel catalogo
	public void modificaProdotto(int id, String nome, String descrizione) {
		magazzino.modificaProdotto(id, nome, descrizione);
	}

	@GetMapping("/stampa")//stampa il catalogo
	public HashMap stampaCatalogo() {
		return magazzino.getCatalogo();
	}

}
