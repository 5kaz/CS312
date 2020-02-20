
public class Manuel extends Livre{
	private int niveau;
	
	// Constructeur
	
	public Manuel (int numero, String titre, String auteur, int nbPages, int niveau) {
		super (numero, titre, auteur, nbPages);
		this.niveau = niveau;
	}
	
	// Getter
	
	public int getNiveau() {
		return this.niveau;
	}
	
	@Override
	public String toString() {
		return "Manuel: {niveau = " + niveau + "}\n" + super.toString();
	}
}
