package it.trian.stage.shopcart;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * 
 *  classe denominata articolo la quale ha la
 *         funzione di tenere sempre aggiornata la quantità dell'articolo
 *         (Ottimizzato)
 * @author Nicholas Antinori
 * @author Mario Andrei Cojocaru
 * @version 1.3
 */

public class Articolo { // classe articolo un semplice pojo
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Articolo.class);
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
		LOG.info("ProductId| " + getIdProdotto());
		LOG.info("Quantita Ordinta| " + getQuantity());
	}
}
