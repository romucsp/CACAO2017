package abstraction.transformateur.europe;

public class ValeurAjoutee {
	 
	private double valeurajoutee;
	
	 public ValeurAjoutee(double valeurajoutee){
		 this.valeurajoutee=valeurajoutee;
	 }
	 
	 public void setValeurajoutee(double valeurajoutee){
		 this.valeurajoutee=valeurajoutee;
	 }
	 
	 public double getValeurajoutee(){
		 return this.valeurajoutee;
	 }
	 
	 public double AjoutValeurajoutee(double prix){
		 return prix*this.valeurajoutee;
	 }
	 
}
