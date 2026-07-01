package Decorator.first.concrete;

import Decorator.first.interfaces.Bebida;

public class Cafe implements Bebida {

    private double price = 10;
    private String descricao;

    public Cafe(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public double custo() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
