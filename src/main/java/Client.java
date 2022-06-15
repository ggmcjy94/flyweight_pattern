public class Client {

    public static void main(String[] args) {
        Flyweight flyweight;
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();


        flyweight = flyweightFactory.getFlyweight("A");
        System.out.println(flyweight.operation(100));

        flyweight = flyweightFactory.getFlyweight("A");
        System.out.println(flyweight.operation(200));

        flyweight = flyweightFactory.getFlyweight("B");
        System.out.println("\n*** Number of flyweights created: " + flyweightFactory.getSize() + " ***");


    }
}
