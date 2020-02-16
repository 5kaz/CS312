
public class Exercice2 {
	public static void main(String[] args) {
		Fraction frac1 = new Fraction (123,456);
		Fraction frac2 = new Fraction (789,10);
		frac1.add(11);
		frac1.addFraction(frac2.getNumerateur(), frac2.getDenominateur());
		frac1.mult(12);
		frac1.reduire();
		
		frac1.afficher();
	}
}
