package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

import Collisions.Collisions;
import GameObject.GameWorld;
import ImageLoader.ImageLoader;
import InputHandler.PlayStatesInput;

public class PlayState extends State {

private GameWorld gm;
private StateManeger sm;
Random rnd = new Random();

    private static double sayac=0;
    public PlayState(StateManeger sm){
        super(sm);
        this.sm=sm;
        this.sayac=getSayac();
        gm=new GameWorld();
        ImageLoader.change(rnd.nextInt(5));
        Gdx.input.setInputProcessor(new PlayStatesInput(this));
        gm.initWalls();

    }


    public void render(SpriteBatch sb) {
    sb.setProjectionMatrix(camera.combined);
    sb.begin();
        ImageLoader.font.draw(sb,String.valueOf((int)sayac),Gdx.graphics.getWidth()*1/40,Gdx.graphics.getHeight()*1/30);
        if(PlayState.getSayac()>1000){
            ImageLoader.font.draw(sb,"Stage-5",Gdx.graphics.getWidth()*11/20,Gdx.graphics.getHeight()*1/30);
        }else if(PlayState.getSayac()>750){
            ImageLoader.font.draw(sb,"Stage-4",Gdx.graphics.getWidth()*11/20,Gdx.graphics.getHeight()*1/30);

        }else if(PlayState.getSayac()>400){
            ImageLoader.font.draw(sb,"Stage-3",Gdx.graphics.getWidth()*11/20,Gdx.graphics.getHeight()*1/30);

        }
        else if(PlayState.getSayac()>150){
            ImageLoader.font.draw(sb,"Stage-2",Gdx.graphics.getWidth()*11/20,Gdx.graphics.getHeight()*1/30);
        }
        else if(PlayState.getSayac()<150){
            ImageLoader.font.draw(sb,"Stage-1",Gdx.graphics.getWidth()*11/20,Gdx.graphics.getHeight()*1/30);
        }
    sb.end();

    gm.render(sb);
    }
    public void update(float delta) {
        if(gm.getWall().getCollision2Rect().y>100+gm.getPlayer().getCollisionRect().y){
            ImageLoader.change(rnd.nextInt(5));
        }
        if (gm.getWall().getCollision5Rect().y>Gdx.graphics.getHeight()+220) {
            gm.initWalls();
        }
        gm.update(delta);
        if(Collisions.isThereCollision(gm.getPlayer(),gm.getWall()))
        {
            sm.pushState(new GameOverState(sm, (int) getSayac()));
            sayac=0;
        }
        else{
            sayac=sayac+1;
        }
    }


    public void handleInput() {

    }
    public GameWorld getGameWorld(){
        return gm;
    }

    public static double getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        PlayState.sayac = sayac;
    }
}
