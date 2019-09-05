package domein;

public class Calculator extends TargetLong {

    private final long x;
    private final long y;

    public Calculator(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long add() {
        return x + y;
    }

}
