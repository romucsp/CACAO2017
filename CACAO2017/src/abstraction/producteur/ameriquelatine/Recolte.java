package abstraction.producteur.ameriquelatine;

public class Recolte {
	private int surfacecultivable; //Constante : surface cultivable max
<<<<<<< HEAD
	private int prodmax; // Constante production max en fonction de la surface cultivable
	private double indiceRecolte; // Indicateur variant entre 0 et 1 : pourcentage pour fixer nb de fèves totales
	private int Qterecoltee;
	public Recolte(int qterecoltee, int surfacecultivable, int prodmax, double indiceRecolte){
=======
	
	private double indiceRecolte; // Indicateur variant entre 0 et 1 : pourcentage pour fixer nb de fèves totales, gros pic à une période de l'annee puis diminution notable de l'indice 
	
	public Recolte(int qterecoltee, int surfacecultivable, double indiceRecolte){
>>>>>>> origin/master
		this.surfacecultivable=surfacecultivable;
		this.indiceRecolte=indiceRecolte;
		Qterecoltee=(int)(prodmax*indiceRecolte);
	}

<<<<<<< HEAD
	public int getQterecoltee() {
		return this.Qterecoltee;
=======
	public int Qterecoltee() {
		return (int)(surfacecultivable*indiceRecolte);
>>>>>>> origin/master
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
