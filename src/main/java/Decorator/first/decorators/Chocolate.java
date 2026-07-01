package Decorator.first.decorators;

import Decorator.first.interfaces.Bebida;

public class Chocolate {
    private Bebida bebida;

    Chocolate(Bebida bebida){
        this.bebida = bebida;
    }

    public Bebida adicionarLeite(){
        this.bebida.setPrice(this.bebida.custo() + 4);
        return this.bebida;
    }
}
