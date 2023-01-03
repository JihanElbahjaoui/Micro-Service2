public class CanardElectrique implements IntreCanard{
    private boolean allume;

    public void CanardElectrique(){
        System.out.println("CanardElectique");
    }

    @Override
    public void voler(){
        if(this.allume) {
            voler();
        }
    }
}
