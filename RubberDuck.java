// Concrete subclass of Duck representing a Rubber Duck
public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a Rubber duck");
    }
}
