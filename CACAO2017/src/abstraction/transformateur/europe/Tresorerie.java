package abstraction.transformateur.europe;

public class Tresorerie {

	private double compte;
	
	public Tresorerie(double compte){
		this.compte=compte;
	}
	
	public Tresorerie(){
		this(0);
	}
	
	public double getCompte(){
		return this.compte;
	}
	
	public void setCompte(double compte){
		this.compte=compte;
	}
	
	public void ajoutChiffredaffaire(double chiffre_daffaire){
		this.setCompte(chiffre_daffaire+this.compte);
	}
	
	public void retraitVente(double vente){
		this.setCompte(-vente+ this.compte);
	}
}
