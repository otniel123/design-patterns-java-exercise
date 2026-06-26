package Observer.first;

import Observer.first.interfaces.PedidoObserver;
import Observer.first.model.PedidoModel;
import Observer.first.service.EmailService;
import Observer.first.service.EstoqueService;
import Observer.first.service.NotaFiscalService;
import Observer.first.service.PedidoService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PedidoObserver> pedidoObserverList = new ArrayList<>();
        NotaFiscalService notaFiscalService = new NotaFiscalService();
        EmailService emailService = new EmailService();
        EstoqueService estoqueService = new EstoqueService();

        List<String> itens = new ArrayList<>();

        itens.add("Desinfetante");
        itens.add("Chocolate");

        PedidoModel pedidoModel;

        pedidoModel = new PedidoModel.PedidoBuilder()
                .emailCliente("olazinho@gmail.com")
                        .status("PENDENTE")
                                .itens(itens)
                                        .build();


        pedidoObserverList.add(notaFiscalService);
        pedidoObserverList.add(emailService);
        pedidoObserverList.add(estoqueService);

        PedidoService pedidoService = new PedidoService(pedidoObserverList);

        pedidoService.confirmarPedido(pedidoModel);
    }
}
