package Adapter.third;

import Adapter.third.adapters.MercadoPagoAdapter;
import Adapter.third.interfaces.Pagamento;
import Adapter.third.model.MercadoPagoAPI;
import Adapter.third.model.PagamentoService;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new MercadoPagoAdapter();
        PagamentoService pagamentoService = new PagamentoService(pagamento);

        pagamentoService.pagar(22.50);
    }
}
