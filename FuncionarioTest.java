package polimorfismo.execute;

import polimorfismo.objetos.Fucionario;
import polimorfismo.objetos.Gerente;
import polimorfismo.objetos.Vendedor;

public class FuncionarioTest {
    public static void main(String... args) {
        Gerente g = new Gerente("Taialandia", 3000, 4000);
        Vendedor v = new Vendedor("Suecia", 1000, 5000);
        Relatory rell = new Relatory();
        rell.relVen(v);
        Fucionario f = g;
        rell.relGer(f);
    }
}
