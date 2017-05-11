package abstraction.distributeur.amerique;

import abstraction.distributeur.europe.IDistributeur;
import abstraction.distributeur.europe.Vente;
import abstraction.fourni.Indicateur;
import abstraction.fourni.Monde;

public class DistributeurUS implements IDistributeur{
	private Treso treso;
	private Indicateur fonds;
	private Indicateur stock;
	
	public DistributeurUS(Treso treso, Indicateur fonds, Indicateur stock){
		this.treso=treso;
		this.fonds=fonds;
		this.stock=stock;
	}
	
	public DistributeurUS(){
		this.treso= new Treso(5000000000.0,62.5,new Demande(62.5));
		this.fonds=new Indicateur("Fonds du distributeurUS", this, 5000000000.0);
		this.stock=new Indicateur("Stock du distributeurUS", this, 62.5);
		Monde.LE_MONDE.ajouterIndicateur(this.fonds);
		Monde.LE_MONDE.ajouterIndicateur(this.stock);
	}
	
	
	public void next(){
		//System.out.println(Monde.LE_MONDE.getStep()+" "+this.getTreso().getDemande().demandeStep());
		
		this.getTreso().setStock(this.getTreso().getStock()-this.getTreso().getDemande().getCommande());
		
		
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
