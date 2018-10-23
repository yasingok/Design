package Ducks;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("“I’m fl ying with a rocket!”");
    }
}
