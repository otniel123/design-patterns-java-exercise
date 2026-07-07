package Decorator.third.concrete;

import Decorator.third.interfaces.Notificador;

public class Email implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email: \n" + mensagem );
    }
}
