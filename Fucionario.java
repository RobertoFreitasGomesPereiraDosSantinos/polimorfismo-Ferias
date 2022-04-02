package polimorfismo.objetos;

public abstract class Fucionario {
    
    protected String nom;
    protected double slr;

    public Fucionario(String nom, double slr) {
        this.setNom(nom);
        this.setSlr(slr);
    }

    public abstract void calcSlr();
    public double getSlr() {
        return slr;
    }

    public void setSlr(double slr) {
        this.slr = slr;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    } 
}
