package part1.ab;

import part1.inter.FlyWithWings;
import part1.inter.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBegavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}