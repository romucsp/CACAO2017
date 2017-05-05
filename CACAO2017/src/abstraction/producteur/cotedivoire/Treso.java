package abstraction.producteur.cotedivoire;
import java.util.ArrayList; 

public class Treso {
	//modifie by @antoineroson
	//by fcadre
	private ArrayList<Integer> benefmensuel;
	private Stock stock; //Stock appartenant au producteur
	private double ca; // Chiffre d'affaire sur la période d'un next
	private double coutdeprod; //Cout de production au kilo
	private double coutacheminement; //Cout d acheminement
	private double coutmaindoeuvre; 
	private double benefice;  
	
	public Treso(Stock stock, double ca, double cp, double cach, double cmdo, double benef){ 
		this.stock = stock; 
		this.ca = ca; 
		this.coutdeprod = cp; 
		this.coutacheminement = cach;
		this.coutmaindoeuvre = cmdo; 
		this.benefice = benef; 
	}
	public int getStock(){ 
		return this.getStock(); 
	}
	
	public double getCa(){ 
		return this.ca; 
	}
	public double getCoutdeprod(){ 
		return this.coutdeprod; 
	}
	public double getCoutacheminement(){ 
		return this.coutacheminement; 
	}
	public double getCoutmaindoeuvre(){ 
		return this.coutmaindoeuvre; 
	}
	public double getBenefice(){ 
		return this.benefice;  
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public void setCa(double ca) {
		this.ca = ca;
	}
	public void setCoutdeprod(double coutdeprod) {
		this.coutdeprod = coutdeprod;
	}
	public void setCoutacheminement(double coutacheminement) {
		this.coutacheminement = coutacheminement;
	}
	public void setCoutmaindoeuvre(double coutmaindoeuvre) {
		this.coutmaindoeuvre = coutmaindoeuvre;
	}
	public void setBenefice(double benefice) {
		this.benefice = this.getCa() - this.getCoutacheminement() - this.getCoutmaindoeuvre() - this.getCoutdeprod();
	}
	
}
