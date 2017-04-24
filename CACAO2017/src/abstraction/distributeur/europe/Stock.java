//Classe codée par Walid
package abstraction.distributeur.europe;
import java.util.*;

import abstraction.distributeur.europe.Stock.Chocolats;

class QuantiteChoco {
	private Chocolats typeChoco;
	public QuantiteChoco(Chocolats typeChoco, int quantite){
		this.typeChoco = typeChoco;
		this.quantite = quantite;
	}
	public Chocolats getTypeChoco() {
		return typeChoco;
	}
	public void setTypeChoco(Chocolats typeChoco) {
		this.typeChoco = typeChoco;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	private int quantite;
	
}
public class Stock {
	
	public enum Chocolats{
		Chocolat_au_lait,
		Chocolat_blanc,
		Chocolat_noir,
	}
	
	private ArrayList<QuantiteChoco> stock;
	
	public Stock(ArrayList<QuantiteChoco> stock){
		this.stock = stock;
	}

	public ArrayList<QuantiteChoco> getStock() {
		return stock;
	}

	public void setStock(ArrayList<QuantiteChoco> stock) {
		this.stock = stock;
	}
	
	public void addElement(Chocolats Choco, int nombre_de_choco){
			this.getStock().add(new QuantiteChoco(Choco, nombre_de_choco));
	}
	
	public void deleteElement(Chocolats Choco, int nombre_de_choco){
			this.getStock().remove(new QuantiteChoco(Choco, nombre_de_choco));
	}
	
	public int nbChoco(){
		int nb = 0;
		for (int i=0; i<this.getStock().size(); i++){
			nb = nb + this.getStock().get(i).getQuantite();
		}
		return nb;
	}
	
}
