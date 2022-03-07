package kjd.linkedin.adapter.drone;

import kjd.linkedin.strategy.duck.Duck;

public class DroneAdapter extends Duck {

    Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public String quack() {
        return drone.beep();
    }

    @Override
    public String fly() {
        return String.format("%s %s", drone.spinRotors(), drone.takeoff());
    }

    @Override
    public void display() {
        System.out.println("Drone");
    }
    
}
