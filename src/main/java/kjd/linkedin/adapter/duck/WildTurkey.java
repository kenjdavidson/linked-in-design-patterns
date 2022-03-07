package kjd.linkedin.adapter.duck;

public class WildTurkey implements Turkey {

    @Override
    public String gobble() {
        return "Gobble!";
    }

    @Override
    public String fly() {
        return "Fly short distance";
    }
    
}
