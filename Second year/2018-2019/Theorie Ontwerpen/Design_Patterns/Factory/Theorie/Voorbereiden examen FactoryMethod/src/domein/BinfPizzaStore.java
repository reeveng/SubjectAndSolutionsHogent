package domein;

public class BinfPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        switch (type.toLowerCase()) {
            case "cheese":
                return new BinfCheesePizza();
            case "pepperoni":
                return new BinfPepperoniPizza();
            case "clam":
                return new BinfClamPizza();
            case "veggie":
                return new BinfVeggiePizza();
            default:
                return null;
        }
    }

}
