
public class Bibliotheque {
	private int taille;
	protected Document bibliotheque[];
	
	public Bibliotheque(int capacite) {
		this.taille = capacite;
		this.bibliotheque = new Document[capacite] ;
	}
	
	public int premierDocLibre() {
		int ret=0;
		for (Document doc : bibliotheque) {
			if (doc == null) {
				return ret;
			}
			ret++;
		}
		return -1; // si bibliotheque remplie
	}
	
	public boolean ajouter(Document doc) {
		boolean ret = false;
		if (premierDocLibre() != -1) {
			bibliotheque[premierDocLibre()]=doc;
			ret = true;
		}
		else {
			System.out.println("Opération impossible, bibliotheque pleine");
		}
		return ret;
		
	}
	public void afficherDocuments() {
		for (Document doc : bibliotheque) {
			if (doc != null) {
				System.out.println("Numero : " + doc.getNumero());
				System.out.println("Titre : " + doc.getTitre());	
			}
		}
	}
	
	public void afficherAuteurs() {
		for (Document doc : bibliotheque) {
			if (doc instanceof Livre) {
				System.out.println("Auteur : " + ((Livre) doc).getAuteurs());
			}
		}
	}
	
	public int ajouterLivres(Document[] tableauDocs) {
		int ret = 0, i=0;
		if (premierDocLibre() != -1) {
			for (i=premierDocLibre(); i<taille ; i++) {
				if (tableauDocs[ret] instanceof Livre) {
						bibliotheque[i]=tableauDocs[ret];
						ret++;
				}
			}
		}
		else {
			System.out.println("Opération impossible, bibliotheque pleine");
		}
		return ret;
	}
	
	
}
