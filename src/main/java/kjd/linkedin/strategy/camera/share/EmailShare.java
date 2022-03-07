package kjd.linkedin.strategy.camera.share;

public class EmailShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Email");
    }
}
