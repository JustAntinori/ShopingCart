package it.trian.stage.shopcart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 	@author Nicholas Antinori & Mario Andrei Cojocaru 	
 * 	  Servizio Web di un carrello acquisti realizzato con un server
 *    API (Application Programming Interface) REST la quale non è altro che
 *    un'Interfaccia di Programmazione delle Applicazioni
 */

@RestController
@RequestMapping("/")
public class ControllerMagazzino {
	
	@PostMapping("/Aggiungi")
	public void AaggiungiCatalogo() {
		
	}
	
	@DeleteMapping("/Rimuovi")
	public void RimuoviProdotto(){
		
	}
	
	@PostMapping("/Modifica")
	public void ModificaProdotto() {
		
	}
	
	@GetMapping("/Catalogo")
	public void StampaCAtalogo() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
