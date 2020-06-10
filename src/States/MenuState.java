package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Buttons.Button;
import ImageLoader.ImageLoader;
import InputHandler.MenuStateHandler;

public class MenuState extends State{
    private StateManeger sm;
    private Button playButton;
    private Button practiceButton;

    public MenuState(StateManeger sm) {
        super(sm);
        this.sm=sm;
        Gdx.input.setInputProcessor(new MenuStateHandler(this));
        playButton=new Button(Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/2,ImageLoader.ButtonRegion);
        practiceButton=new Button(Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/2-300,ImageLoader.button2Region);
    }

    public void render(SpriteBatch sb) {
         sb.setProjectionMatrix(camera.combined);
         sb.begin();
         sb.draw(ImageLoader.MenuBgReg,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
         ImageLoader.font.draw(sb,"RENK BOMBASI",Gdx.graphics.getWidth()*1/15,Gdx.graphics.getHeight()*1/20);
         sb.end();
         practiceButton.render(sb);
         playButton.render(sb);
    }

    public void update(float delta) {
    }
    public void handleInput() {
    }
    public StateManeger getSm() {
        return sm;
    }
    public Button getPlayButton() {
        return playButton;
    }
    public Button getPracticeButton() {
        return practiceButton;
    }
    public void setPlayButton(Button playButton) {
        this.playButton = playButton;
    }
}
