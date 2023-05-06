import part1.ab.Duck;
import part1.ab.MallardDuck;
import part1.ab.ModelDuck;
import part1.inter.FlyRocketPowered;

public class App {
    public static void main(String[] args) throws Exception {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
