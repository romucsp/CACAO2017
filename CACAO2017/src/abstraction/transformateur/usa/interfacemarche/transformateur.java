package abstraction.transformateur.usa.interfacemarche;

public interface transformateur {
	/*Souchu*/
	public double getprixMin();
	public void notif(double prix,double quantité);
	
	public double QteSouhaite();
	
	public void notificationAchat(double vendu, double prix);

}

