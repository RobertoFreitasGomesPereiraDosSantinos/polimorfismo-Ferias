package polimorfismo.objetos;

public class Vendedor extends Fucionario{
    private double tven;

    public Vendedor(String nom, double slr, double tven) {
        super(nom, slr);
        this.tven = tven;
    }

    public double getTven() {
        return tven;
    }

    public void setTven(double tven) {
        this.tven = tven;
    }

    public void calcSlr() {
        slr = slr + (tven * 0.1);
    }
    
}
