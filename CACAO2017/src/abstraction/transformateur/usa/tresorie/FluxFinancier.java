package abstraction.transformateur.usa.tresorie;

//Souchu Bastien

abstract class FluxFinancier {
	private String Entreprise; 
	private float montantFacture;
	private float commande;//Quantité commandée
	
	public FluxFinancier(String nomEntreprise,float commande){
		this.Entreprise=nomEntreprise;
		this.commande=commande;
	}
	
	public FluxFinancier(){
		this("",0);
	}
	
	public float getMontant(){
		return this.montantFacture;
	}
	
	public String getEntreprise(){
		return this.Entreprise;
	}
	
	public float getCommande(){
		return this.commande;
	}
	
	public void setCommande(float commande){
		this.commande=commande;
	}
	
}
