package abstraction.transformateur.europe;

public class Stock {

	private double stockcacao;
	private double stockchocolat;
	private double stockMax;
	
	public Stock(){
		this.stockcacao=10;
		this.stockchocolat=10;
		this.stockMax=100;
	}
	
	public double getstockcacao(){
		return this.stockcacao;
	}
	
	public double getstockchocolat(){
		return this.stockchocolat;
	}
	
	public double getStockMax(){
		return this.stockMax;
	}
	
	public void setstockcacao(double cacao){
		this.stockcacao=this.getstockcacao()+cacao;
	}
	
	public void setstockchocolat(double choco){
		this.stockchocolat=this.getstockchocolat()+choco;
	}
	
	public String toString(){
		return "stock de cacao: "+this.stockcacao+"   stock de chocolat: "+this.stockchocolat;
	}
	
}
