import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static final FlyweightFactory INSTANCE = new FlyweightFactory();

    public FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return INSTANCE;
    }

    // Shared flyweight pool.
    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    // Creating and maintaining shared flyweights.
    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            System.out.println("Sharing a flyweight with key = " + key);
            return flyweights.get(key);
        }  else {
            System.out.println("Creating a flyweight with key = " + key);
            Flyweight flyweight = new ConcreteFlyweight(key); // assuming key = intrinsic state
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }

    public int getSize() {
        return flyweights.size();
    }
}
