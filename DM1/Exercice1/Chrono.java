
public class Chrono {
	private int heures;
	private int minutes;
	private int secondes;

	public int getHeures(){
	    return this.heures ;
	}
	public int getMinutes(){
	    return this.minutes ;
	}
	public int getSecondes(){
		return this.secondes ;
	}
	public void setHeures(int H){
	    this.heures = H ;
	}
	public void setMinutes(int M){
	    this.minutes = M ;
	}
	public void setSecondes(int S){ //constructeur pour initialiser à 0 le chrono
	    this.secondes = S ;
	}
	public Chrono (){
	    this.heures = 0;
	    this.minutes = 0;
	    this.secondes = 0;
	}
	public Chrono (int S, int M, int H){ //constructeur pour initaliser avec des valeurs précises
	    this.heures = H;
	    this.minutes = M;
	    this.secondes = S;
	}
	public void rebours(){ //probleme : si le chrono arrive à 0:0:0 l'heure va devenir négative, on peut y remédier en ajoutant une condition qui permet de ne pas décrémenter si le chrono est à 0 
	    secondes--;
		if (secondes < 0){
	      secondes = 9;
	      minutes--;
	    }
	    if (minutes < 0){
	      minutes = 59;
	      heures--;
	    }
	}
}
