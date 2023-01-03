
public class LibrairieApp {

	public static void main(String[] args) {
		Etagere favoris=new Etagere();
		Livre bok=new Livre("clean code");
		Livre bok2=new Livre("refactoring");
		favoris.ajouterLivre(bok);
		favoris.ajouterLivre(bok2);
	}

}
