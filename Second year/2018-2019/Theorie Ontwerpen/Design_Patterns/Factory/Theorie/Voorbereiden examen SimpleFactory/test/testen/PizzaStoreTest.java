package testen;

import domein.CheesePizza;
import domein.ClamPizza;
import domein.PepperoniPizza;
import domein.Pizza;
import domein.PizzaStore;
import domein.SimplePizzaFactory;
import domein.VeggiePizza;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PizzaStoreTest {

    private PizzaStore pizzaStore;

    @Before
    public void before() {
        pizzaStore = new PizzaStore(new SimplePizzaFactory());
    }

    @Test
    public void clamPizza() {
        Pizza pizza = pizzaStore.orderPizza("Clam");
        Assert.assertTrue(pizza instanceof ClamPizza);
    }

    @Test
    public void cheesePizza() {
        Pizza pizza = pizzaStore.orderPizza("CHEESE");
        Assert.assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    public void pepperoniPizza() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        Assert.assertTrue(pizza instanceof PepperoniPizza);
    }

    @Test
    public void veggiePizza() {
        Pizza pizza = pizzaStore.orderPizza("vEgGiE");
        Assert.assertTrue(pizza instanceof VeggiePizza);
    }

    @Test
    public void bestaatNietPizza() {
        Pizza pizza = pizzaStore.orderPizza("bestaatNIET");
        Assert.assertNull(pizza);
    }
}
