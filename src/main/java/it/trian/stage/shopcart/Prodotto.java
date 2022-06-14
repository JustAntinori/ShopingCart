package it.trian.stage.shopcart;

/**
 * @author Nicholas Antinori & Mario Andrei Cojocaru questa classe contiene gli
 *         attributi che avrà il prodotto visibile nel catalogo
 */
public class Prodotto {
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

	public void stampa() {
		System.out.println("ID| " + getId());
		System.out.println("Nome| " + getName());
		System.out.println("Descrizione| " + getDescription());
	}
}
