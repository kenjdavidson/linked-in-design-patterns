package kjd.linkedin.strategy.camera;

import kjd.linkedin.strategy.camera.edit.GlamourEdit;
import kjd.linkedin.strategy.camera.save.LocalSave;
import kjd.linkedin.strategy.camera.share.ExtraShare;
import kjd.linkedin.strategy.camera.take.StandardPhoto;

public class SocialCameraApp extends PhoneCameraApp {
    public SocialCameraApp() {
        super(new StandardPhoto(), new GlamourEdit(), new LocalSave(), new ExtraShare());
    }
}
