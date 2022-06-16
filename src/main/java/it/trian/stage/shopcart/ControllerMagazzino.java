package it.trian.stage.shopcart;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
	@PostMapping("/aggiungi")
	public void AaggiungiCatalogo(int id, String nome,@RequestParam(required=true) String Descrizione) {
		 magazzino.addProdotto(id, nome, Descrizione);
		
	}

	
	/**
	 * @param id
	 * @return id se ok,altrimenti -1 
	 */
	@DeleteMapping("/rimuovi")
	public int RimuoviProdotto(int id) { 
		int temp=0;
		temp=magazzino.removeProdotto(id);
		return temp;
		

	}

	@PostMapping("/modifica")
	public void ModificaProdotto(int id, String nome, String descrizione) {
		magazzino.modificaProdotto(id, nome, descrizione);

	}

	@GetMapping("/stampa")
	public HashMap StampaCAtalogo() {
		return magazzino.getCatalogo();

	}

}
