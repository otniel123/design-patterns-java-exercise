package Observer.first.model;

import java.util.ArrayList;
import java.util.List;

public class PedidoModel {
    private String status;
    private List<String> itens = new ArrayList<>();
    private String emailCliente;

    private PedidoModel() {
    }

    private PedidoModel(PedidoBuilder pedidoBuilder) {
        this.status = pedidoBuilder.status;
        this.itens = pedidoBuilder.itens;
        this.emailCliente = pedidoBuilder.emailCliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public static class PedidoBuilder{
        private String status;
        private List<String> itens = new ArrayList<>();
        private String emailCliente;

        public PedidoBuilder() {
        }

        public PedidoBuilder status(String status){
            this.status = status;
            return this;
        }

        public PedidoBuilder itens(List<String> itens){
            this.itens = itens;
            return this;
        }

        public PedidoBuilder emailCliente(String emailCliente){
            this.emailCliente = emailCliente;
            return this;
        }

        public PedidoModel build(){
            return new PedidoModel(this);
        }
    }

}
