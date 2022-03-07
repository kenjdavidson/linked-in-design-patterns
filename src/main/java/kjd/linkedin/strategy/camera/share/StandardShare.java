package kjd.linkedin.strategy.camera.share;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardShare implements ShareBehaviour {
    List<String> options = new ArrayList<>();

    public StandardShare() {
        options.add("Email");
        options.add("SMS");
    }

    @Override
    public void share() {
        System.out.println(options.toString());
    }    


}
