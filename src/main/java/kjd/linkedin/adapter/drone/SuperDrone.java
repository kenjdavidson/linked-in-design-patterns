package kjd.linkedin.adapter.drone;

public class SuperDrone implements Drone {

    @Override
    public void beep() {
        System.out.println("Beep!");
    }

    @Override
    public void spinRotors() {
        System.out.println("Rotors are spinning");
    }

    @Override
    public void takeoff() {
        System.out.println("Taking off");
    }
    
}
