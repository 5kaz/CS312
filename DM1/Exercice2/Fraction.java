
public class Fraction {

	private int numerateur;
	private int denominateur;
	
	public Fraction (int num, int den) {
		this.denominateur = den;
		this.numerateur = num;
	}
	
	public void add (int nombre) {
		this.numerateur = (nombre * this.denominateur) + this.numerateur;
	}
	public void sub (int nombre) {
		this.numerateur = this.numerateur - (nombre * this.denominateur);
	}
	
	public void mult (int nombre) {
		this.numerateur = this.numerateur * nombre;
	}
	public void reduire () {
		int pgcd = pgcd(this.denominateur,this.numerateur);
		this.numerateur = this.numerateur / pgcd ;
		this.denominateur = this.denominateur /pgcd ;
	}
	public void addFraction (int num2, int den2) {
		int dentmp=den2;
		num2=this.denominateur * num2;
		den2=this.denominateur * den2;
		this.denominateur = this.denominateur * dentmp;
		this.numerateur = this.numerateur * dentmp + num2;
		this.reduire();
	}
	public void multFraction (int num2, int den2) {
		this.numerateur = this.numerateur * num2;
		this.denominateur = this.denominateur * den2;
	}

	public void afficher() {
		System.out.println(this.numerateur + "/" + this.denominateur);
	}
	public int getNumerateur() {
		return this.numerateur;
	}
	public int getDenominateur() {
		return this.denominateur;
	}
	
	public int pgcd(int a, int b) {
		int r;
		if (b>a) {
			int x = a;
			a = b;
			b = x;
		}
		do{
			r = a % b;
			a = b;
			b = r;
			
		} while (r != 0);
		return a;
	}
}	
