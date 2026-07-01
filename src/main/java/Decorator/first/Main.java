package Decorator.first;

import Decorator.first.concrete.Cafe;
import Decorator.first.decorators.Leite;
import Decorator.first.interfaces.Bebida;

public class Main {
    public static void main(String[] args) {
        Bebida cafe = new Cafe("Café com leite");
        cafe = Leite.adicionarLeite(cafe);

        System.out.println(cafe.custo());
    }
}
