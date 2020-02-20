
public class DM2 {
	public static void main(String[] args){
		
		Revue revue = new Revue(0, "Cazou", 2420, 12);
		Roman roman = new Roman(1, "Yano", "Sun Tzu", 1337, 2);
		
		System.out.println(revue);
		System.out.println(roman);
		
		System.out.println("-------------------------------");
		
		Bibliotheque bib = new Bibliotheque(5);
		
		bib.ajouter(revue);
		bib.ajouter(roman);
		
		bib.afficherDocuments();
		bib.afficherAuteurs();
		
		System.out.println("-------------------------------");
		
		Roman livre1 = new Roman(2, "Sundy","Sundy",42,1);
		Roman livre2 = new Roman(3, "Sundy","Sundy",42,1);
		Roman livre3 = new Roman(4, "Sundy","Sundy",42,1);
		Roman livre4 = new Roman(5, "Sundy","Sundy",42,1);
		
		Document[] tableauDocs = {livre1,livre2,livre3,livre4};
		
		System.out.println(bib.ajouterLivres(tableauDocs) + " documents ont été ajoutés");
		
		bib.afficherDocuments();
		
		System.out.println("-------------------------------");
		
		

	}
}
