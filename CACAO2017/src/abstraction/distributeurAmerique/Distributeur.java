package abstraction.distributeurAmerique;

import abstraction.fourni.Acteur;

public class Distributeur implements Acteur{
	private String nom;
	private double stock;
	private double fonds;
	private double demande;
	
	
	public String getNom(){
		return this.nom;
	}
	
	public void next(){
		
	}
}
