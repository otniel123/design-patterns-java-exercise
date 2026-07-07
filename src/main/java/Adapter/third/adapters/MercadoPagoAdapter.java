package Adapter.third.adapters;

import Adapter.third.interfaces.Pagamento;
import Adapter.third.model.MercadoPagoAPI;

public class MercadoPagoAdapter implements Pagamento {
    private MercadoPagoAPI mercadoPagoAPI = new MercadoPagoAPI();

    @Override
    public void pagar(double valor) {
        this.mercadoPagoAPI.realizarPagamento(valor);
    }
}
