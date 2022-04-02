package polimorfismo.execute;

import polimorfismo.objetos.Fucionario;
import polimorfismo.objetos.Gerente;
import polimorfismo.objetos.Vendedor;

public class Relatory {

    public void relGer(Fucionario f) {
        if (f instanceof Gerente) { 
            f.calcSlr();
            System.out.println("Relatorio de gerente\nNome: "+f.getNom()+"\nSálario: R$"+f.getSlr());
        }
    }
    public void relVen(Vendedor ven) {
        ven.calcSlr();
        System.out.println("Relatorio de vendedor\nNome: "+ven.getNom()+"\nSálario: R$"+ven.getSlr());
    }
}
