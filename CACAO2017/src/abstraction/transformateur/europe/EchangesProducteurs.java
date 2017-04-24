package abstraction.transformateur.europe;

public class EchangesProducteurs {
	
	private Stock s;
	
	public EchangesProducteurs(Stock s){
		this.s=s;
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
