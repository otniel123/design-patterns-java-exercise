package Adapter.third.model;

import Adapter.third.interfaces.Pagamento;

public class PagamentoService {
    private Pagamento pagamento;

    public PagamentoService(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void pagar(double valor){
        this.pagamento.pagar(valor);
    }
}
