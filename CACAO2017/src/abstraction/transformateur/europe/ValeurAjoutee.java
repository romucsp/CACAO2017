package abstraction.transformateur.europe;

public class ValeurAjoutee {
	 
	private double valeurajoutee;
	
	 public ValeurAjoutee(double valeurajoutee){
		 this.valeurajoutee=valeurajoutee;
	 }
	 
	 public double AjoutValeurajoutee(double prix){
		 return prix*this.valeurajoutee;
	 }
	 
}
