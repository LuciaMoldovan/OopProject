public class Inotator extends Sportiv implements A,B{

    public Abilitate abilitateaInotatorului;


    public Inotator(String proba, String tara) {
        super(proba, tara);
    }

    @Override
    void seAntreneaza() {
        System.out.println("Inotatorul se antreneaza");

    }
       public void seOdihneste() {
            System.out.println("Inotatorul se Odihneste");
        };
    public void ceTaraReprezinta(){
    System.out.println("Inotatorul reprezinta"+super.tara);
}

    @Override
    public void metodaA() {

    }

    @Override
    public void metodaB() {

    }
}