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
@RequestMapping("/")
public class ControllerMagazzino {
	Magazzino catalogo = new Magazzino();

	@PostMapping("/Aggiungi")
	public void AaggiungiCatalogo(int id, String nome, String Descrizione) {
		catalogo.addprodotto(id, nome, Descrizione);
	}

	@DeleteMapping("/Rimuovi")
	public void RimuoviProdotto(int id) {
		catalogo.removeprodotto(id);

	}

	@PostMapping("/Modifica")
	public void ModificaProdotto(int id, String nome, String Descrizione) {
		catalogo.modificaproduct(id, nome, Descrizione);

	}

	@GetMapping("/Catalogo")
	public void StampaCAtalogo() {
		catalogo.stampaCatalogo();

	}

}
