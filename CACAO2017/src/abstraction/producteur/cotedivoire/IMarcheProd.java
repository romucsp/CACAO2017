package abstraction.producteur.cotedivoire;
import abstraction.fourni.v0.*;

public interface IMarcheProd {
	
	/// modifié par War20 et Lolottisyoung
	
	public double quantiteAchetable();
	
	public double quantiteVoulue();
	
	public void addProducteur(Producteur p);
	
	public void addTransformateur(Transformateur t);
	
	
}
