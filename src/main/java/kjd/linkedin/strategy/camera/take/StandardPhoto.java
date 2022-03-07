package kjd.linkedin.strategy.camera.take;

public class StandardPhoto implements TakeBehaviour {
    @Override
    public void take() {
        System.out.println("Standard Colour Photo");
    }    
}
