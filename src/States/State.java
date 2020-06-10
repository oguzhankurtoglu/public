package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class State {
    protected OrthographicCamera camera;//abstract classlar kalıtım vericeği için türetilen sınıftan ulaşılması gerekiyor o yüzden protected
    protected StateManeger sm;

    public State(StateManeger sm){
        this.sm=sm;
        camera=new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
    }
    public abstract void render(SpriteBatch sb);
    public abstract void update(float delta);
    public abstract void handleInput();
}
