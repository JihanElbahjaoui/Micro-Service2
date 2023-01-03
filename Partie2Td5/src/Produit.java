public  abstract class  Produit {

    public Produit(String titre) {
        this.titre = titre;
    }

    private String titre;

    abstract public void voirAvis();
    abstract public lireExtrait();
}
