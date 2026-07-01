package Decorator.second;

import Decorator.second.concrete.Guerreiro;
import Decorator.second.decorator.Escudo;
import Decorator.second.decorator.Espada;
import Decorator.second.interfaces.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Guerreiro();
        personagem = Espada.adicionarEspada(personagem);
        personagem = Escudo.adicionarEscudo(personagem);

        System.out.println(personagem.ataque());
    }
}
