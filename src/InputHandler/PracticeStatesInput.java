package InputHandler;//PLAYSTATENIN AYNISIDIR
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;
import States.MenuState;
import States.PlayState;
import States.PracticeState;
public class PracticeStatesInput implements InputProcessor {

    private PracticeState practiceState;
    public PracticeStatesInput(PracticeState practiceState){
        this.practiceState=practiceState;
    }
    @Override
    public boolean keyDown(int keycode) {
        return false;
    }
    @Override
    public boolean keyUp(int keycode) {
        return false;
    }
    @Override
    public boolean keyTyped(char character) {
        return false;
    }
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        practiceState.getPracticeWorld().getController().setClick(true);
        practiceState.getPracticeWorld().getPlayer().setMoveWidthDirection(true);
        return false;
    }
    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {

        if (practiceState.getPracticeButton().getButtonRect().contains(screenX,screenY)){
            practiceState.getSm().pushState(new MenuState(practiceState.getSm()));
        }
        practiceState.getPracticeWorld().getController().setClick(false);
        practiceState.getPracticeWorld().getPlayer().setMoveWidthDirection(false);
        practiceState.getPracticeWorld().getController().setEndKord(new Vector2(practiceState.getPracticeWorld().getController().getEndKord()));
        return false;
    }
    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }
    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }
    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
