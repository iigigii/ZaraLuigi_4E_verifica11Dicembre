public class Quadrato {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double calcolaArea() {
        return lato * lato;
    }

    //metodo get informazioni
    public String getInformazioni(){
        return "Quadrato con lato: " + lato + ". area = " + calcolaArea();
    }


}