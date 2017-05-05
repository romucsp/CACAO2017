package abstraction.producteur.cotedivoire;

public class Test {
	public static void main (String[] args) {
		MarcheProd marche= new MarcheProd();
		System.out.println(marche.getCoursActuel());
		marche.setQuantiteAchetableGlob(2000);
		marche.setQuantiteVoulueGlob(3000);
		marche.Bourse();
		System.out.println(marche.getCoursActuel());
		marche.setQuantiteAchetableGlob(3000);
		marche.setQuantiteVoulueGlob(2000);
		marche.Bourse();
		System.out.println(marche.getCoursActuel());
		
		ProductionCoteDIvoire prod= new ProductionCoteDIvoire(); 
		prod.variationProduction();
		System.out.println(prod.getProductions());
		System.out.println(prod.getQuantiteProd());
		prod.variationProduction();
		System.out.println(prod.getProductions());
		System.out.println(prod.getQuantiteProd());
		prod.variationProduction();
		System.out.println(prod.getProductions());
		System.out.println(prod.getQuantiteProd());
	}
}
