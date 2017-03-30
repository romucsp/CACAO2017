package abstraction.distributeur.groupe2;

public class Commande {
	private String Nom;
	private int quantite;
	
	public Commande(String Nom, int quantite){
		this.Nom = Nom;
		this.quantite = quantite;
	}
	
	public String getNom(){
		return this.Nom;
	}
	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public void setNom(String nom) {
		Nom = nom;
	}
	
	
}
