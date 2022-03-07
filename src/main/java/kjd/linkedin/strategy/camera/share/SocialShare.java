package kjd.linkedin.strategy.camera.share;

public class SocialShare extends StandardShare {
    public SocialShare() {
        super();
        
        options.add(new InstagramShare()); 
    }
}
