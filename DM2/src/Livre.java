
public class Livre extends Document{
	private String auteur;
	private int nbPages;
	
	// Constructeur
	
	public Livre(int numero, String titre, String auteur,int nbPages) {
		super(numero, titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	
	// Getters 
	
	public String getAuteurs() {
		return this.auteur;
	}
	
	public int getnbPages() {
		return this.nbPages;
	}
	
	// Affichage 
	
	@Override
	public String toString() {
		return "Livre: {auteur = " + auteur + ", nombre de pages = " + nbPages + "}\n" + super.toString();
	}
}
