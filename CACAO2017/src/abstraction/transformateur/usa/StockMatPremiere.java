package abstraction.transformateur.usa;

public class StockMatPremiere {
	/*modif souhu*/
	private double Cacao;
	private double Lait;
	private double Sucre;
	private double Beurre;
	private double Farine;
	
	public StockMatPremiere (double Cacao,double Lait, double Sucre, double Beurre, double Farine){
		this.Cacao= Cacao;
		this.Lait=Lait;
		this.Sucre=Sucre;
		this.Beurre=Beurre;
		this.Farine=Farine;
	}
	
	public StockMatPremiere(){
		this(0,0,0,0,0);
	}
	
	public double getCacao(){
		return this.Cacao;
	}
	
	public double getLait(){
		return this.Lait;		
	}
	
	public double getSucre(){
		return this.Sucre;
	}
	
	public double getBeurre(){
		return this.Beurre;
	}
	
	public double getFarine(){
		return this.Farine;
	}
	
	public void setCacao(double cacao){
		this.Cacao=cacao;
	}
	
	public void setLait(double Lait){
		this.Lait=Lait;		
	}
	
	public void setSucre(double Sucre){
		this.Sucre=Sucre;
	}
	
	public void setBeurre(double Beurre){
		this.Beurre=Beurre;
	}
	
	public void setFarine(double Farine){
		this.Farine=Farine;
	}
	
	public void enleverFarine(double Farine){
		this.Farine-=Farine;
	}
	public void enleverBeurre(double Beurre){
		this.Beurre-=Beurre;
	}
	public void enleverSucre(double Surcre){
		this.Sucre-=Sucre;;
	}
	public void enleverLait(double Lait){
		this.Lait-=Lait;
	}
	public void eneleverCacao(double Cacao){
		this.Cacao-=Cacao;
	}

	
	
}
