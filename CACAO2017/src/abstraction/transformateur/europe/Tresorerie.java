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
		this.setCompte(chiffre_daffaire+this.getCompte());
	}
	
	public void retraitAchat(double achat){
		this.setCompte(this.getCompte()-achat);
	}
}
