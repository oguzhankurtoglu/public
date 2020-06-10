package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

import Buttons.Button;
import GameObject.PracticeWorld;
import ImageLoader.ImageLoader;
import InputHandler.PracticeStatesInput;

public class PracticeState extends State {

    private PracticeWorld practiceWorld;
    private StateManeger sm;
    Random rnd = new Random();
    private Button backButton;

    private static double sayac=0;
    public PracticeState(StateManeger sm){
        super(sm);
        this.sm=sm;
        this.sayac=getSayac();
        practiceWorld=new PracticeWorld();
        ImageLoader.change(rnd.nextInt(5));
        Gdx.input.setInputProcessor(new PracticeStatesInput(this));
        backButton=new Button(0,0,ImageLoader.backButtonRegion);
    }


    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        sb.end();

        practiceWorld.render(sb);
        backButton.render(sb);
    }

    public void update(float delta) {

if(practiceWorld.getPoint().getCollisionRect().y>Gdx.graphics.getHeight()+220){
    ImageLoader.change(rnd.nextInt(5));
    practiceWorld.initPoints();
}
if(practiceWorld.getPlayer().getCollisionRect().overlaps(practiceWorld.getPoint().getCollisionRect())){
    ImageLoader.change(rnd.nextInt(5));
    practiceWorld.initPoints();

}
        practiceWorld.update(delta);


    }


    public void handleInput() {

    }
    public PracticeWorld getPracticeWorld(){
        return practiceWorld;
    }
    public Button getPracticeButton() {
        return backButton;
    }


    public static double getSayac() {
        return sayac;
    }
    public StateManeger getSm() {
        return sm;
    }

    public static void setSayac(int sayac) {
        PracticeState.sayac = sayac;
    }
}
