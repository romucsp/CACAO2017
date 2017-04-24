package abstraction.transformateur.europe;

public class EchangesProducteurs {
	
	private double quantiteSouhaitee;
	private Stock s;
	
	public EchangesProducteurs(double quantiteSouhaitee,Stock s){
		this.quantiteSouhaitee = quantiteSouhaitee;
		this.s=s;
	}
	
	public double getQuantiteSouhaitee(){
		return this.quantiteSouhaitee;
	}
	
	public Stock getStock(){
		return this.s;
	}
	
	public double getQuantiteMax(){
		double stockCacao=this.s.getstockcacao();
		double stockMax=this.s.getStockMax();
		return stockMax-stockCacao; //test
		
	}
	
	
}