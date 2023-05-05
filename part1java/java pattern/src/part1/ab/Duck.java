package part1.ab;

import part1.inter.FlyBehavior;
import part1.inter.QuackBegavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBegavior quackBegavior;

    public void performQuack() {
        quackBegavior.quack();
    }

}
