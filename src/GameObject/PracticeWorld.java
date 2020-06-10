package GameObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

import Controller.Controller;
import ImageLoader.ImageLoader;

public class PracticeWorld implements GameObject {
    private Player player;
    private Controller controller;
    private Point point;
    int x,yKord=-220;
    Random rastgele = new Random();
    int sayi;



    public PracticeWorld(){
        controller=new Controller(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()*4/5,75);
        player =new Player(Gdx.graphics.getWidth()/2-50,Gdx.graphics.getHeight()/2,100,100,controller);
initPoints();
    }
    public void render(SpriteBatch sb) {

        player.render(sb);
        point.render(sb);

    }
    public void update(float delta) {
        player.update(delta);
        controller.update(delta);
        point.update(delta);
    }
    public void random(){

        sayi = rastgele.nextInt(5);

            if(sayi==1){
                x=660;
            }
            if(sayi==2){
                x=880;
            }
            if(sayi==3){
                x=220;
            }
            if(sayi==4){
                x=440;
            }
            if(sayi==5){
                x=0;
            }





    }
    public void initPoints(){
        random();
        ImageLoader.changePoint(rastgele.nextInt(5));
        point=new Point(x,yKord);
    }

    public Player getPlayer(){return player;}
    public Controller getController(){return controller;}
    public Point getPoint(){return point;}

}
