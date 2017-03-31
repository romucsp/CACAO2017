package abstraction.transformateur.groupe5.tresorie;

import java.util.ArrayList;
import java.util.List;
 //Souchu Bastien
public class Tresorie {
	
	private float CompteCourant=0;
	private List<Achat> LAchat=new ArrayList<Achat>(); 
	private List<Vente> LVente=new ArrayList<Vente>();

	public void addVente(Vente c){
		LVente.add(c);
	}
 
	public void addAchat(Achat d){
		LAchat.add(d);
	}

	public List<Vente> getVentes(){
		return LVente;
	}

	public List<Achat> getAchat(){
		return LAchat;
	}
	
	public void removeAchat(){
		if (addTresorie(LAchat.get(0).getMontant(),false))
		LAchat.remove(0);
	}
	public void removeVente(Vente c){
		if(addTresorie(LVente.get(0).getMontant(),true))
		LVente.remove(c);
	}

	public float getTresorie(){
		return this.CompteCourant;
	}
	
	public boolean addTresorie(float montant,boolean sens){
		if (sens){
			this.CompteCourant+=montant;
			return true;
		}
		else if (this.CompteCourant-montant>0){
			this.CompteCourant-=montant;
			return true;
		}
		return false; //Return false si la trésorie n'est pas suffisante pour payer la facture
	}
}
