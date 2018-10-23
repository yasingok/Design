package Ducks;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        quackBehavior2 = new Squeak();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("“Im a real Mallard duck”");
    }
}
