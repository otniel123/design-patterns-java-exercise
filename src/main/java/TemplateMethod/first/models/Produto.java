package TemplateMethod.first.models;

public class Produto {
    private String nome;
    private String id;
    private long quantidade;

    public Produto(String nome, String id, long quantidade) {
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }
}
