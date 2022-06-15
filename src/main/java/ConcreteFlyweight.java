public class ConcreteFlyweight implements Flyweight{

    private String intrinstcState;

    public ConcreteFlyweight(String intrinstcState) {
        this.intrinstcState = intrinstcState;
    }

    @Override
    public String operation(int extrinsicState) {
        return "  performing an operation on the flyweight\n "
                + " with intrinsic state = " + this.intrinstcState
                + " and passed in extrinsic state = " + extrinsicState + ".";
    }
}
