package abstraction.distributeur.amerique;

import abstraction.distributeur.europe.IDistributeur;
import abstraction.distributeur.europe.Vente;
import abstraction.fourni.Monde;

public class DistributeurUS implements IDistributeur{
	private Treso treso;
	
	public DistributeurUS(Treso treso){
		this.treso=treso;
	}
	
	public DistributeurUS(){
		this.treso= new Treso(5000000000.0,625000,new Demande(625000.0));
	}
	
	
	public void next(){
		//System.out.println(Monde.LE_MONDE.getStep()+" "+this.getTreso().getDemande().demandeStep());
		/*Appeler le marché ou un truc comme ça*/
		this.getTreso().setStock(this.getTreso().getStock()-this.getTreso().getDemande().getCommande());
		double commande = this.getTreso().getDemande().demandeStep();
		
	}

	
	
	public double getStock() {
		return this.getTreso().getStock();
	}

	public void setStock(double stock) {
		this.getTreso().setStock(stock);
	}

	public double getFonds() {
		return this.getTreso().getFonds();
	}



	public Treso getTreso(){
		return this.treso;
	}


	
	public double getPrixMax(){
		return this.getTreso().prixMax();
	}
	
	public void notif(Vente vente){
		this.setStock(this.getStock()+vente.getQuantite());
		this.getTreso().setFonds(this.getFonds()-vente.getPrix());
	}

	public String getNom() {
		return "Distributeur USA";
	}
	
		
	
}
