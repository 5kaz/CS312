
public class Revue extends Document{
	private int annee;
	private int mois;
	
	// Constructeur
	
	public Revue (int numero, String titre, int annee, int mois) {
		super(numero,titre);
		this.annee = annee;
		this.mois = mois;
	}
	
	// Getter
	
	public int getAnnee() {
		return this.annee;
	}
	
	public int getMois() {
		return this.mois;
	}
	
	@Override
	public String toString() {
		return "Revue: {mois = " + mois + ", annee = " + annee + "}\n" + super.toString();
	}
}
