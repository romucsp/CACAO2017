package abstraction.producteur.ameriquelatine;

public class Recolte {
	private int surfacecultivable; //Constante : surface cultivable max
	private int prodmax; // Constante production max en fonction de la surface cultivable
	private double indiceRecolte; // Indicateur variant entre 0 et 1 : pourcentage pour fixer nb de fèves totales
	
	public Recolte(int qterecoltee, int surfacecultivable, int prodmax, double indiceRecolte){
		this.surfacecultivable=surfacecultivable;
		this.prodmax=prodmax;
		this.indiceRecolte=indiceRecolte;
	}

	public int Qterecoltee() {
		return (int)(prodmax*indiceRecolte);
	}

	public int getSurfacecultivable() {
		return surfacecultivable;
	}

	public void setSurfacecultivable(int surfacecultivable) {
		this.surfacecultivable = surfacecultivable;
	}

	public int getProdmax() {
		return prodmax;
	}

	public void setProdmax(int prodmax) {
		this.prodmax = prodmax;
	}

	public double getIndiceRecolte() {
		return indiceRecolte;
	}

	public void setIndiceRecolte(double indiceRecolte) {
		this.indiceRecolte = indiceRecolte;
	}
	
	
}
