package States;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.awt.Image;
import java.util.Random;
import ImageLoader.ImageLoader;
import InputHandler.GameOverInput;

public class GameOverState extends State {//gameover olduğunda çıkıcak ekran
    private StateManeger sm;
    private static int score;
    public GameOverState(StateManeger sm,int score)
    {
        super(sm);
        this.sm=sm;
        this.score=score;
        Gdx.input.setInputProcessor(new GameOverInput(this));
    }
    public void render(SpriteBatch sb) {
        sb.begin();
        ImageLoader.font.draw(sb,"Game Over",Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()*1/5);
        ImageLoader.font.draw(sb,"Score: "+String.valueOf(score),Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()*2/5);
        if(score>1000){
            sb.draw(ImageLoader.icon5,Gdx.graphics.getWidth()/4,Gdx.graphics.getHeight()*3/5);
        }else if(score>750){
            sb.draw(ImageLoader.icon4,Gdx.graphics.getWidth()/4,Gdx.graphics.getHeight()*3/5);

        }else if(score>400){
            sb.draw(ImageLoader.icon3,Gdx.graphics.getWidth()/4,Gdx.graphics.getHeight()*3/5);
        }
        else if(score>150){
            sb.draw(ImageLoader.icon2,Gdx.graphics.getWidth()/4,Gdx.graphics.getHeight()*3/5);
        }
        else if(score<150){
            sb.draw(ImageLoader.icon,Gdx.graphics.getWidth()/4,Gdx.graphics.getHeight()*3/5);
        }
        sb.end();
    }
    public void update(float delta) {}
    public void handleInput() {}
    public StateManeger getSm() {
        return sm;
    }
    public void setSm(StateManeger sm) {
        this.sm = sm;
    }
}
