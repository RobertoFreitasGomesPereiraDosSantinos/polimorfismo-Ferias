package polimorfismo.objetos;

public class Gerente extends Fucionario {

    private double parluc;

    public Gerente(String nom, double slr, double plc) {
        super(nom, slr);
        this.setParluc(plc);
    }

    public double getParluc() {
        return parluc;
    }

    public void setParluc(double parluc) {
        this.parluc = parluc;
    }

    public void calcSlr() {
    slr = parluc;        
    }
    
}
