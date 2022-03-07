package kjd.linkedin.strategy.camera;

import kjd.linkedin.strategy.camera.edit.GlamourEdit;
import kjd.linkedin.strategy.camera.edit.StandardEdit;
import kjd.linkedin.strategy.camera.save.LocalSave;
import kjd.linkedin.strategy.camera.share.StandardShare;
import kjd.linkedin.strategy.camera.take.StandardPhoto;

public class StandardCameraApp extends PhoneCameraApp {
    public StandardCameraApp() {
        super(new StandardPhoto(), new StandardEdit(), new LocalSave(), new StandardShare());
    }
}
