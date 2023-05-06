package part1.ab;

import part1.inter.FlyNoWay;
import part1.inter.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBegavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }

}
