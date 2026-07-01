package Decorator.first.decorators;

import Decorator.first.interfaces.Bebida;

public class Leite {

    public static Bebida adicionarLeite(Bebida bebida){
        bebida.setPrice(bebida.custo() + 2);
        return bebida;
    }
}
