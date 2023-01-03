package src.lecteurMultimediaProbleme;

public class App {
	public static void main(String[] args) {
		Imedia myDev = new Dvd();
		LecteurMultimedia LM=new LecteurMultimedia(myDev);
		LM.lire();

	}
}
