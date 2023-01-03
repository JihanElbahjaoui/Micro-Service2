package src.lecteurMultimediaProbleme;
public class LecteurMultimedia {
	Imedia X;

	public LecteurMultimedia(Imedia Y) {
		X = Y;
	}

	public String SetImedia(Imedia Y){ X=Y;
		return null;
	}
	public String lire (){
		X.afficher();
		return null;
	}
}
