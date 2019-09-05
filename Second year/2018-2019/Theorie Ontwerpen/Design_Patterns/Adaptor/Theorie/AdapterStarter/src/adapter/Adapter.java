package adapter;

import domein.Duck;
import domein.MallardDuck;
import domein.WildTurkey;

public class Adapter {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        testDuck(duck);
//TODO : uncomment
//        WildTurkey turkey = new WildTurkey();
//        Duck turkeyAdapter = null;
//                = new TurkeyAdapter(turkey);
//        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
