package InputHandler;
import com.badlogic.gdx.InputProcessor;
import States.MenuState;
import States.PlayState;
import States.PracticeState;

public class MenuStateHandler implements InputProcessor {
private MenuState menuState;
    public MenuStateHandler(MenuState menuState){
        this.menuState=menuState;
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
    public boolean touchDown(int screenX, int screenY, int pointer, int button) { //menude butonlara göre playstate yada practice stateye geçiş yapar
        if (menuState.getPlayButton().getButtonRect().contains(screenX,screenY)){
            menuState.getSm().pushState(new PlayState(menuState.getSm()));
        }
        if (menuState.getPracticeButton().getButtonRect().contains(screenX,screenY)){
            menuState.getSm().pushState(new PracticeState(menuState.getSm()));
        }
        return false;
    }
    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
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
