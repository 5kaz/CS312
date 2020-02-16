
public class Chrono2 {
	private int nbSecondes = 0;

	  public int getHeures(){
	    return (this.nbSecondes/3600) ;
	  }
	  public int getMinutes(){
	    return (this.nbSecondes/60 % 60) ;
	  }
	  public int getSecondes(){
	    return (this.nbSecondes % 60) ;
	  }
	  
	  public void setHeures(int H){
	    this.nbSecondes = this.nbSecondes + H * 3600 ;
	  }
	  public void setMinutes(int M){
	    this.nbSecondes = this.nbSecondes + M * 60 ;
	  }
	  public void setSecondes(int S){
	    this.nbSecondes = this.nbSecondes + S ;
	  }
	  
	  public Chrono2 (int H , int M ,int S){ //constructeur pour initialiser le chrono avec heures,minutes,secondes
	    this.nbSecondes = H * 3600 + M * 60 + S ;
	  }
	  
	  public Chrono2 (int S) {
		this.nbSecondes = S;
	  }
	  
	  public void rebours() {
		if (this.nbSecondes > 0){
			 this.nbSecondes = this.nbSecondes - 1;
		} 
	 }
		  
}
