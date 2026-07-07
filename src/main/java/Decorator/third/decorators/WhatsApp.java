package Decorator.third.decorators;

import Decorator.third.interfaces.Notificador;

public class WhatsApp implements Notificador {

    Notificador notificador;

    public WhatsApp(Notificador notificador){
        this.notificador = notificador;
    }
    @Override
    public void enviar(String mensagem) {
        this.notificador.enviar(mensagem);
        System.out.println("Enviando WhatsApp: \n" + mensagem);
    }
}
