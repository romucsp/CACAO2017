//Classe codée par Walid
package abstraction.distributeur.europe;
import java.util.*;

public class Stock {
	
	public enum Chocolats{
		Chocolat_au_lait,
		Chocolat_blanc,
		Chocolat_noir,
	}
	
	private ArrayList<Chocolats> stock;
	
	public Stock(ArrayList<Chocolats> stock){
		this.stock = stock;
	}

	public ArrayList<Chocolats> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Chocolats> stock) {
		this.stock = stock;
	}
	
	public void addElement(Chocolats Choco, int nombre_de_choco){
		for (int i=0; i<nombre_de_choco; i++){
			this.getStock().add(Choco);
		}
	}
	
	public void deleteElement(Chocolats Choco, int nombre_de_choco){
		for (int i=0; i<nombre_de_choco; i++){
			this.getStock().remove(Choco);
		}
	}
	
}
