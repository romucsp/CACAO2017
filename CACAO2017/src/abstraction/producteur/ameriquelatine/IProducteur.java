package abstraction.producteur.ameriquelatine;

public interface IProducteur {
	public double quantiteMiseEnvente() ;
	public void notificationVente(double quantite, double coursActuel); // cours actuel, pris à la tonne
	
}
