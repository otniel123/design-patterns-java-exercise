package Builder.first;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listAdditional = new ArrayList<>();
        Pizza pizza = new Pizza.PizzaBuilder()
                .size("30")
                .stuffedCrust(false)
                .additional(listAdditional)
                .notes("")
                .onion(true)
                .wholeWheatPizza(false)
                .build();

        System.out.println(pizza);
    }
}
