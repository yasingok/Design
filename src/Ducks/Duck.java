package Ducks;

public abstract class Duck {
    QuackBehavior quackBehavior;
    QuackBehavior quackBehavior2;
    FlyBehavior flyBehavior;

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
        quackBehavior2.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("“All ducks float, even decoys!”");
    }
}
