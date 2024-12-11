public class Poligono {
    private int numeroLati;
    private double lunghezzaLato;

    //costruttore
    public Poligono(int numeroLati, double lunghezzaLato) {
        this.numeroLati = numeroLati;
        this.lunghezzaLato = lunghezzaLato;
    }

    //metodi getter - setter numeroLati
    public int getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    //metodi getter - setter lunghezzaLato
    public double getLunghezzaLato() {
        return lunghezzaLato;
    }

    public void setNumeroLati(double lunghezzaLato) {
        this.lunghezzaLato = lunghezzaLato;
    }

    /*
    Il perimetro di un poligono è uguale al prodotto tra il numero di lati e la lunghezza del lato
    */
    public double calcolaPerimetro(int numeroLati, double lunghezzaLato){
        return numeroLati * lunghezzaLato;
    }

    //metodo toString (il metodo toString ritorna una stringa formattata contenente le informazioni sul poligono)
    public String toStrimg(){
        return String.format("Poligono con " + numeroLati + " lati di lunghezza " + lunghezzaLato + ", perimetro: " + calcolaPerimetro(numeroLati, lunghezzaLato));
    }
}