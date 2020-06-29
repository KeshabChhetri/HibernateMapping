package com.OneToOne;

public class Details {
	private int id; 
	private String City;
	private String State;
	private String Country;
	private Player P;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Player getP() {
		return P;
	}
	public void setP(Player p) {
		P = p;
	}
	
	

}
