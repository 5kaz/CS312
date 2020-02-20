
public class Livrotheque extends Bibliotheque {

	public Livrotheque(int capacite) {
		super(capacite);
	}

	@Override
	public boolean ajouter(Document doc) {
		boolean ret = true;
		int index = premierDocLibre();
		if(index == -1 || !(doc instanceof Livre)) {
			ret = false;
		}
		else {
			bibliotheque[index] = doc;
		}
		return ret;
	}
}