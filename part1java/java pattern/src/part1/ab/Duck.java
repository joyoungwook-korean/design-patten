package part1.ab;

import part1.inter.FlyBehavior;
import part1.inter.QuackBegavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBegavior quackBegavior;

    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quackBegavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swim All Duck");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBegavior(QuackBegavior qb) {
        quackBegavior = qb;
    }
}
