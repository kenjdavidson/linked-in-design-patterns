package kjd.linkedin.adapter;

import java.util.ArrayList;
import java.util.List;

import kjd.linkedin.adapter.drone.DroneAdapter;
import kjd.linkedin.adapter.drone.SuperDrone;
import kjd.linkedin.adapter.duck.Duck;
import kjd.linkedin.adapter.duck.TurkeyAdapter;
import kjd.linkedin.adapter.duck.WildTurkey;
import kjd.linkedin.adapter.duck.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new TurkeyAdapter(new WildTurkey()));
        ducks.add(new DroneAdapter(new SuperDrone()));

        for (Duck duck : ducks) {
            duck.quack();
            duck.fly();
        }
    }
}
