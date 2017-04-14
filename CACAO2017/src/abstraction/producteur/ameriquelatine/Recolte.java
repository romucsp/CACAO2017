package abstraction.producteur.ameriquelatine;
//MOdifié par Lolotteisyoung et AnaisBel
public class Recolte {
	public final static int SURFACE_CULTIVABLE=20; //Constante : surface cultivable max
	private double indiceRecolte; // Indicateur variant entre 0 et 1 : pourcentage pour fixer nb de fèves totales
	private int qterecoltee;
	
	public Recolte(int qterecoltee, double indiceRecolte){
		
		this.indiceRecolte=indiceRecolte;
		qterecoltee=(int)(SURFACE_CULTIVABLE*indiceRecolte);
	}

	public int getQterecoltee() {
		return this.qterecoltee;

	}

	public int getSurfacecultivable() {
		return SURFACE_CULTIVABLE;
	}

	public double getIndiceRecolte() {
		return indiceRecolte;
	}

	public void setIndiceRecolte(double indiceRecolte) {
		this.indiceRecolte = indiceRecolte;
	}
	
	
}
