package com.codefactory.model;

public class student {
	private int id;
	private String name;
	private String ville;
	
	public student() {
		
	}
	public student(int id, String name, String ville) {
		super();
		this.id = id;
		this.name = name;
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", ville=" + ville + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	

}
