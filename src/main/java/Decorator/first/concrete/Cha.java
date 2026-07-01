package Decorator.first.concrete;

import Decorator.first.interfaces.Bebida;

public class Cha implements Bebida {

    private double price = 12;
    private String descricao;

    public Cha(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String descricao() {
        return this.descricao;
    }

    @Override
    public double custo() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
