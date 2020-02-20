
public class Document {
	private int numero = 0;
	private String titre = "";
	
	// Getters
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTitre() {
		return this.titre;
	}
	
	// Constructeur
	
	public Document (int numero, String titre) {
		this.numero = numero;
		this.titre = titre;
	}
	
	// Affichage
	
	public String toString() {
		return "Document: {numero = " + numero + ", titre = " + titre + "}\n";
	}
	
}
