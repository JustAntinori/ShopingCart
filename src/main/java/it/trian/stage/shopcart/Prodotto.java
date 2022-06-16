package it.trian.stage.shopcart;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * 
 * questa classe contiene gli attributi che avrà il prodotto visibile nel catalogo
 * 
 * @author Nicholas Antinori 
 * @author Mario Andrei Cojocaru 
 * @version 1.2
 */
public class Prodotto {
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Prodotto.class);
	private long id;
	private String name;
	private String description;

	public Prodotto(long id, String name, String description) {

		this.id = id;
		this.name = name;
		this.description = description;

	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void stampa() {	//metodo stampa dell'oggetto prodotto e tiene traccia tramite il file log 
		LOG.info("ID| " + getId());
		LOG.info("Nome| " + getName());
		LOG.info("Descrizione| " + getDescription());
	}
}
