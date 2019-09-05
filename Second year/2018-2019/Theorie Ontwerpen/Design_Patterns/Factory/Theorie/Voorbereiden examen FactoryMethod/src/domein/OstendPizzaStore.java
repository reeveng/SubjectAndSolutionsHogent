package domein;

public class OstendPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "cheese":
                return new OstendCheesePizza();
            case "pepperoni":
                return new OstendPepperoniPizza();
            case "clam":
                return new OstendClamPizza();
            case "veggie":
                return new OstendVeggiePizza();
            default:
                return null;
        }
    }
}
