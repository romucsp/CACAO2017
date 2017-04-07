package abstraction.producteur.ameriquelatine;

public class Recolte {
	private int surfacecultivable; //Constante : surface cultivable max
	
	private double indiceRecolte; // Indicateur variant entre 0 et 1 : pourcentage pour fixer nb de fèves totales, gros pic à une période de l'annee puis diminution notable de l'indice 
	
	public Recolte(int qterecoltee, int surfacecultivable, double indiceRecolte){
		this.surfacecultivable=surfacecultivable;
		this.indiceRecolte=indiceRecolte;
	}

	public int Qterecoltee() {
		return (int)(surfacecultivable*indiceRecolte);
	}

	public int getSurfacecultivable() {
		return surfacecultivable;
	}

	public void setSurfacecultivable(int surfacecultivable) {
		this.surfacecultivable = surfacecultivable;
	}

	public double getIndiceRecolte() {
		return indiceRecolte;
	}

	public void setIndiceRecolte(double indiceRecolte) {
		this.indiceRecolte = indiceRecolte;
	}
	
	
}
