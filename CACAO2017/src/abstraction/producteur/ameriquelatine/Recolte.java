package abstraction.producteur.ameriquelatine;
//MOdifié par Lolotteisyoung et AnaisBel
public class Recolte {
	public final static int SURFACE_CULTIVABLE=20; //Constante : surface cultivable max en hectare
	private double indiceRecolte; // Indicateur variant entre 0 et 1 : pourcentage pour fixer nb de fèves totales
	private int qterecoltee;
	
	public Recolte(double indiceRecolte){// indice initial
		this.indiceRecolte=indiceRecolte;
		this.qterecoltee=(int)(SURFACE_CULTIVABLE*indiceRecolte);
	}

	public int getQterecoltee() {
		return this.qterecoltee;

	}

	public void miseAJourIndice() {
		this.indiceRecolte=Math.random();
	}
	
	
}
