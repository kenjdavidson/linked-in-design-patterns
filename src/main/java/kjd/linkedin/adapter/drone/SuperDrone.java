package kjd.linkedin.adapter.drone;

public class SuperDrone implements Drone {

    @Override
    public String beep() {
        return "Beep!";
    }

    @Override
    public String spinRotors() {
        return "Spinning rotors";
    }

    @Override
    public String takeoff() {
        return "Taking off";
    }
    
}
