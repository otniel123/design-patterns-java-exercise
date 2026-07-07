package Decorator.third.decorators;

import Decorator.third.interfaces.Notificador;

public class Sms implements Notificador {

    Notificador notificador;

    public Sms(Notificador notificador){
        this.notificador = notificador;
    }
    @Override
    public void enviar(String mensagem) {
        this.notificador.enviar(mensagem);
        System.out.println("Enviando SMS: \n" + mensagem);
    }
}
