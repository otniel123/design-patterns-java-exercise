package Decorator.second.decorator;

import Decorator.second.interfaces.Personagem;

public class Escudo {
    public static Personagem adicionarEscudo(Personagem personagem){
        personagem.setAtaque(personagem.ataque() + 2);
        return personagem;
    }
}
