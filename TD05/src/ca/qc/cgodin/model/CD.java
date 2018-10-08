package ca.qc.cgodin.model;

public class CD {
	private int id;
	private String description;
	private double price;
	private int qte;
	
	public CD() {
	
	}
	public CD(int id, String description, double price) {
		this.id = id;
		this.description = description;
		this.price = price;
	}
	
	
	public CD(int id, String description, double price, int qte) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.qte = qte;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
