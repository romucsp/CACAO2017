package abstraction.transformateur.europe;
import abstraction.transformateur.usa.interfacemarche.transformateur;;

public class Transformateur implements transformateur  {

	private String nom;
	private Stock s;
	
	public int hashCode() {
		return this.getNom().hashCode();
	}
	public String getNom() {
		return "Producteur "+this.nom;
	}
	
	public void EchangesProducteurs(Stock s){
		this.s=s;
	}

	public Stock getStock(){
		return this.s;
	}
	
	public double QteSouhaite(){
		double stockCacao=this.s.getstockcacao();
		double stockMax=this.s.getStockMax();
		return stockMax-stockCacao; //test
		
	}
		
	
}
