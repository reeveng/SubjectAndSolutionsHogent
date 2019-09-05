package domein;

import java.util.Random;

class HasQuarterState extends GumballMachineState {

    private Random randomWinner = new Random();

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public String ejectQuarter() {
        gumballMachine.toState( new NoQuarterState(gumballMachine));
        return "Quarter returned";
    }

    @Override
    public String turnCrank() {
        gumballMachine.toState(new SoldState(gumballMachine));
        return "You turned...";
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
