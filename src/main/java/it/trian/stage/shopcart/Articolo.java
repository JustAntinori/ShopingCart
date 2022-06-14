package it.trian.stage.shopcart;

/**
 * @author Nicholas Antinori & Mario Andrei Cojocaru classe denominata articolo
 *         la quale ha la funzione di tenere sempre aggiornata la quantità
 *         dell'articolo (Ottimizzato)
 */
public class Articolo { // classe articolo un semplice pojo
	private long quantity;
	private long idProdotto;

	public Articolo(long idProdotto, long quantity) {
		this.quantity = quantity;
		this.idProdotto = idProdotto;
	}

	// metodi get
	public long getQuantity() {
		return quantity;
	}

	public long getIdProdotto() {
		return idProdotto;
	}

	// metodi set
	public void setIdProdotto(long idProdotto) {
		this.idProdotto = idProdotto;
	}

	public void setQuantityy(long qTmp) {
		this.quantity = qTmp;
	}

	public void stampaArticolo() { // metodo di stampa
		System.out.println("ProductId| " + getIdProdotto());
		System.out.println("Quantita Ordinta| " + getQuantity());
	}
}
