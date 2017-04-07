package abstraction.distributeur.groupe2;
import abstraction.fourni.v0.*;
import abstraction.fourni.*;
public abstract class Distributeur1 implements ITransformateur1, ITransformateur{
	private int qteDemandee;
	private int stock;
	
	public Distributeur1(int qteDemandee, int stock){
		this.qteDemandee = qteDemandee;
		this.stock = stock;
	}
	
	public int getStock(){
		return this.stock;
	}
	
	public int getQteDemandee(){
		return this.qteDemandee;
	}
	
	public double getPrixMax(int prixTransfo){ // strategie lineaire Walid en fonction du prix du transformateur
		double coeff = qteDemandee/stock;
		double prix = coeff*prixTransfo;
		return prix;
	}
}
