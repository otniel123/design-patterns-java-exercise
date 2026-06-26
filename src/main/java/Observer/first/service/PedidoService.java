package Observer.first.service;

import Observer.first.interfaces.PedidoObserver;
import Observer.first.model.PedidoModel;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    PedidoModel.PedidoBuilder pedidoBuilder = new PedidoModel.PedidoBuilder();
    List<PedidoObserver> pedidoObserverList = new ArrayList<>();

    public PedidoService(List<PedidoObserver> pedidoObserverList) {
        this.pedidoObserverList = pedidoObserverList;
    }

    public void confirmarPedido(PedidoModel pedido){
        pedido.setStatus("Confirmado");
        notifyObserversConfirmarPedido(pedido);
    }

    private void notifyObserversConfirmarPedido(PedidoModel pedido){
        for (PedidoObserver p : pedidoObserverList){
            p.aoConfirmarPedido(pedido);
        }
    }
}
