package Observer.first.service;

import Observer.first.interfaces.PedidoObserver;
import Observer.first.model.PedidoModel;

public class EmailService implements PedidoObserver {
    @Override
    public void aoConfirmarPedido(PedidoModel pedido) {
        System.out.println("Ao confirmar pedido email service " + pedido.getEmailCliente());
    }
}
