package abstraction.distributeur.amerique;

class Treso {
	private double fonds;
	private double stock;
	private Demande demande;
	
	public Treso(double stock, double fonds, Demande demande){
		this.fonds=fonds;
		this.stock=stock;
		this.demande=demande;
	}
	
	
	
	public double getFonds() {
		return fonds;
	}



	public double getStock() {
		return stock;
	}



	public Demande getDemande() {
		return demande;
	}

	public void setFonds(double fonds){
		this.fonds=fonds;
	}

	public void setStock(double stock){
		this.stock=stock;
	}
	
	public void setDemande(Demande demande){
		this.demande=demande;
	}

	public double prixMax(){//Premier test, avec ça on utilise tous nos fonds le premier mois
		double aacheter=this.getDemande().demandeStep()-this.getStock();
		double prixmax=this.getFonds()/aacheter;
		
		
		return prixmax;
	}
}
