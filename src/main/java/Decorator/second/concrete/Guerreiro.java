package Decorator.second.concrete;

import Decorator.second.interfaces.Personagem;

public class Guerreiro implements Personagem {
    int ataque = 20;

    @Override
    public int ataque() {
        return this.ataque;
    }

    @Override
    public void setAtaque(int valor) {
        this.ataque = valor;
    }
}
