package Decorator.second.decorator;

import Decorator.second.interfaces.Personagem;

public class Armadura {
    public static Personagem adicionarArmadura(Personagem personagem){
        personagem.setAtaque(personagem.ataque() + 1);
        return personagem;
    }
}
