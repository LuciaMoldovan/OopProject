abstract class Sportiv {
    abstract void seAntreneaza();


    public void seOdihneste(){
        System.out.println("Sportivul se Odihneste");
    };

    public String proba;

    public String tara;

    public Sportiv( String proba,String tara){
        this.proba=proba;
        this.tara=tara;
    }

}
