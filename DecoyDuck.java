public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        //swimBehavior = new Float();
    }

    public void display() {
        System.out.println("I'm a Decoy duck");
    }
}
