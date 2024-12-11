public class Punto {
    private double x;
    private double y;

    //costruttore
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //metodi getter e setter X
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    //metodi getter e setter y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //punto B passato come parametro
    public double xParametro = 2;
    public double yParametro = 6;

    /*Per calcolare la distanza tra due punti, bisogna fare la radice quadrata della differenza delle ascisse al quadrato,
    * + la differenza delle ordinate al quadrato. La formula quindi è: radice_quadrata(Xa-Xb)^2 + (Ya-Yb)^2 */
    public double distanza(double x, double y, double xParametro, double yParametro){
        return Math.sqrt((x - xParametro)*(x - xParametro) + (y - yParametro)*(y - yParametro));
    }

    //Esempio:
    /*
    * Punto A (x, y) inserite dall'utente
    * Punto B (x , y) passate per parametro
    *
    * sqrt(5 - 2)^2 + (2 - 6)^2 =
    * = sqrt(3)^2 + (-4)^2 =
    * = sqrt9 + 16 =
    * sqrt 25 = 5
    */
}