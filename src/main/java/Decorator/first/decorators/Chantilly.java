package Decorator.first.decorators;

import Decorator.first.interfaces.Bebida;

public class Chantilly {
    private Bebida bebida;

    Chantilly(Bebida bebida){
        this.bebida = bebida;
    }

    public Bebida adicionarLeite(){
        this.bebida.setPrice(this.bebida.custo() + 3.5);
        return this.bebida;
    }
}
