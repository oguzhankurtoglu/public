package Controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;


public class Controller {

    private float xKord;
    private float yKord;
    private float radius;
    private  Vector2 endKord;
    private ShapeRenderer sr;
    private OrthographicCamera camera;
    private boolean click=false;



    public Controller(float xKord,float yKord,float radius) {
        this.xKord = xKord;
        this.yKord = yKord;
        this.radius = radius;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sr = new ShapeRenderer();
        sr.setProjectionMatrix(camera.combined);
        endKord = new Vector2();
        endKord.x=xKord;
        endKord.y=yKord;
    }
    public void update ( float delta){
        if (click){
            endKord.x=Gdx.input.getX();
            endKord.y=Gdx.input.getY();
        }
    }
    public Vector2 getEndKord() {
        return endKord;
    }

    public void setEndKord(Vector2 endKord) {
        this.endKord = endKord;
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }


}

