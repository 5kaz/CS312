public class Exercice1 {
	
	public static void main(String[] args){
	      
	      Chrono c2 = new Chrono(0,30,1);
	      while (c2.getSecondes()!=0 || c2.getMinutes()!=0 || c2.getHeures()!=0) {
	    	    System.out.println(c2.getHeures() + ":" + c2.getMinutes() + ":" + c2.getSecondes());
				c2.rebours();
	     }
	      System.out.println("0:0:0");
	      System.out.println("Fin du TD !!");
	      
	      /*
	      Chrono2 c2 = new Chrono2(1,30,0);
	      while (c2.getSecondes()!=0 || c2.getMinutes()!=0 || c2.getHeures()!=0) {
	    	  System.out.println(c2.getHeures() + ":" + c2.getMinutes() + ":" + c2.getSecondes());
	    	  c2.rebours();
	      }
	      System.out.println("0:0:0");
	      System.out.println("Fin du TD !!");
	      */
	 }
}
