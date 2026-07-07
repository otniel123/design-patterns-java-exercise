package Decorator.third;

import Decorator.third.concrete.Email;
import Decorator.third.decorators.Push;
import Decorator.third.decorators.Sms;
import Decorator.third.decorators.WhatsApp;
import Decorator.third.interfaces.Notificador;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Email();
        notificador = new Sms(notificador);
        notificador = new WhatsApp(notificador);
        notificador = new Push(notificador);

        notificador.enviar("OLÁ");    }
}
