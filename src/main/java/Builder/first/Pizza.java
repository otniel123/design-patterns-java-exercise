package Builder.first;

import java.util.List;

public class Pizza {
    private final String size;
    private final boolean stuffedCrust;
    private final List<String> additional;
    private final String notes;
    private final boolean onion;
    private final boolean wholeWheatPizza;

    private Pizza(PizzaBuilder pizzaBuilder){
        this.size = pizzaBuilder.size;
        this.stuffedCrust = pizzaBuilder.stuffedCrust;
        this.additional = pizzaBuilder.additional;
        this.notes = pizzaBuilder.notes;
        this.onion = pizzaBuilder.onion;
        this.wholeWheatPizza = pizzaBuilder.wholeWheatPizza;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", stuffedCrust=" + stuffedCrust +
                ", additional=" + additional +
                ", notes='" + notes + '\'' +
                ", onion=" + onion +
                ", wholeWheatPizza=" + wholeWheatPizza +
                '}';
    }

    public static class PizzaBuilder{
        private String size;
        private boolean stuffedCrust;
        private List<String> additional;
        private String notes;
        private boolean onion;
        private boolean wholeWheatPizza;

        public PizzaBuilder size(String size){
            this.size = size;
            return this;
        }
        public PizzaBuilder stuffedCrust(boolean stuffedCrust){
            this.stuffedCrust = stuffedCrust;
            return this;
        }
        public PizzaBuilder additional(List<String> additional){
            this.additional = additional;
            return this;
        }
        public PizzaBuilder notes(String notes){
            this.notes = notes;
            return this;
        }
        public PizzaBuilder onion(boolean onion){
            this.onion = onion;
            return this;
        }
        public PizzaBuilder wholeWheatPizza(boolean wholeWheatPizza){
            this.wholeWheatPizza = wholeWheatPizza;
            return this;
        }
        public Pizza build() throws Exception {
            if (size == null){
                throw new Exception("Inform the size of pizza");
            }
            return new Pizza(this);
        }
    }
}
