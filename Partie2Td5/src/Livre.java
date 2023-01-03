import java.util.List;

public class Livre extends Produit {


	void voirAvis() {
	         System.out.println("Consultant les avis sur le livre");
	    }

	public Livre( String T) {
		super(T);
	}

	void lireExtrait() {
	    	System.out.println("Lisant un extrait du livre");
	    }
}
