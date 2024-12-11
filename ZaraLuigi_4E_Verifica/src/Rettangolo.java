public class Rettangolo {
    private double base;
    private double altezza;

    /*E' importante avere metodi di calcolo nella classi per l'incapsulamento*/

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }

    /*
    * Il perimetro di un rettangolo si calcola moltiplicando la base * 2 + l'altezza * 2
    *
    * E' utile avere metodi di calcolo in una classe perchè
    * */
    public double calcolaPerimetro(){
        return base * 2 + altezza * 2;
    }

    public int compareTo(Rettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //metodo get informazioni
    public String getInformazioni(){
        return "Rettangolo con base: " + base + " e altezza: " + altezza + ". Perimetro = " + calcolaPerimetro() + " area = " + calcolaArea();
    }
}