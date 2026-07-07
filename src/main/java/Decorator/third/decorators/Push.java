package Decorator.third.decorators;

import Decorator.third.interfaces.Notificador;

public class Push implements Notificador {

    Notificador notificador;

    public Push(Notificador notificador){
        this.notificador = notificador;
    }
    @Override
    public void enviar(String mensagem) {
        this.notificador.enviar(mensagem);
        System.out.println("Enviando push: \n" + mensagem );
    }
}
