
public class Roman extends Livre{
	private int prix; //1 = GONGOURT , 2 = MEDICIS , 3 = INTERALLIE
	
	// Constructeur
	
	public Roman(int numero, String titre, String auteur, int nbPages, int prix) {
		super (numero, titre, auteur, nbPages);
		this.prix = prix;
	}
	
	public String prixEnString() {
		String ret;
		switch (this.prix) {
		case 1 :
			ret = "GONCOURT";
			break;
		case 2 :
			ret = "MEDICIS";
			break;
		case 3 :
			ret = "INTERALLIE";
			break;
		default :
			ret = "Aucun";
			break;
		}
		return ret;
	}
	
	// Getter
	
	public String getPrix() {
		return prixEnString();
	}
	
	@Override
	public String toString() {
		return "Roman: {prix = " + prixEnString() + "}\n" + super.toString();
	}
}
