package Decorator.second.decorator;

import Decorator.second.interfaces.Personagem;

public class Espada {
    public static Personagem adicionarEspada(Personagem personagem){
        personagem.setAtaque(personagem.ataque() + 10);
        return personagem;
    }
}
