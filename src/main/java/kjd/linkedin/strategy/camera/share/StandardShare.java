package kjd.linkedin.strategy.camera.share;

import java.util.ArrayList;
import java.util.List;

public class StandardShare implements ShareBehaviour {
    List<ShareStrategy> options = new ArrayList<>();

    public StandardShare() {
        options.add(new EmailShare());
        options.add(new SMSShare());
    }

    @Override
    public List<ShareStrategy> share() {
        return options;
    }    


}
