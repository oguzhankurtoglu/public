package InputHandler;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;

import Controller.Controller;
import States.PlayState;

public class PlayStatesInput implements InputProcessor {

    private PlayState playState;

    public PlayStatesInput(PlayState playState){
        this.playState=playState;
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

        playState.getGameWorld().getController().setClick(true);
        playState.getGameWorld().getPlayer().setMoveWidthDirection(true);
        playState.getGameWorld().getController().setEndKord(new Vector2(playState.getGameWorld().getController().getEndKord()));//farklı platformlar için koordinatları Gdx.graphics.getWidth methodu ile alabiliriz

        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {

        playState.getGameWorld().getController().setClick(false);
        playState.getGameWorld().getPlayer().setMoveWidthDirection(false);
        playState.getGameWorld().getController().setEndKord(new Vector2(playState.getGameWorld().getController().getEndKord()));//farklı platformlar için koordinatları Gdx.graphics.getWidth methodu ile alabiliriz

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
