package kjd.linkedin.strategy.camera;

import kjd.linkedin.strategy.camera.edit.EditBehaviour;
import kjd.linkedin.strategy.camera.save.SaveBehaviour;
import kjd.linkedin.strategy.camera.share.ShareBehaviour;
import kjd.linkedin.strategy.camera.take.TakeBehaviour;

/**
 * Provides a standard Camera application that contains the following functionality:
 * 
 * - Taking a photo
 * - Editing a photo
 * - Saving a photo
 * - Sharing a photo
 * 
 * all of which are configurable based on the requirements of the Camera implementation.
 * 
 * @author kenjdavidson
 */
public abstract class PhoneCameraApp {
    private TakeBehaviour takeBehavior;
    private EditBehaviour editBehaviour;
    private SaveBehaviour saveBehaviour;
    private ShareBehaviour shareBehaviour;

    protected PhoneCameraApp(
        TakeBehaviour takeBehaviour,
        EditBehaviour editBehaviour,
        SaveBehaviour saveBehaviour,
        ShareBehaviour shareBehaviour
    ) {
        this.takeBehavior = takeBehaviour;
        this.editBehaviour = editBehaviour;
        this.saveBehaviour = saveBehaviour;
        this.shareBehaviour = shareBehaviour;
    }

    public void take() {
        takeBehavior.take();
    }

    public void edit() {
        editBehaviour.edit();
    }

    public void save() {
        saveBehaviour.save();
    }

    public void share() {
        shareBehaviour.share();
    }
}
