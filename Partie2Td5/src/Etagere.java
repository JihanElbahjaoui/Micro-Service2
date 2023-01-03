import java.util.ArrayList;
import java.util.List;

public class Etagere {

	List<Livre> livres;

	public Etagere() {
		livres = new ArrayList<>();
	}

	void ajouterLivre(Livre kitab) {
		livres.add(kitab);
	}

	void personaliserEtagere() {
		System.out.println("Tu peux personaliser votre étagère");
	}
}
