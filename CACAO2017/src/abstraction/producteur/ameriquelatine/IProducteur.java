package abstraction.producteur.ameriquelatine;

public interface IProducteur {
	public double quantiteMiseEnVente();
	public void notificationVente(double quantite, double coursActuel);
}
