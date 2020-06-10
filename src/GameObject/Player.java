package GameObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.awt.Image;

import Controller.Controller;
import ImageLoader.ImageLoader;

public class Player implements GameObject{

    private float xKord;
    private float yKord;
    private float width;
    private float height;
    private Vector2 direction;
    private Controller controller;
    private Vector2 position;
    private Vector2 size;
    private Rectangle collisionRect;

    private boolean moveWidthDirection=false;

    public Player(float xKord, float yKord, float width, float height,Controller controller){
        this.controller=controller;
        this.xKord=xKord;
        this.yKord=yKord;
        this.width=width;
        this.height=height;
        position=new Vector2(xKord,yKord);
        size=new Vector2(width,height);
        direction=new Vector2();
        collisionRect=new Rectangle(position.x,position.y,size.x,size.y);

    }

    public void render(SpriteBatch sb) {
         sb.begin();
         sb.draw(ImageLoader.playerRegion,xKord,yKord,width,height);

         sb.end();
    }

    public void update(float delta) {

        collisionRect.x=xKord;
        collisionRect.y=yKord;
        collisionRect.width=size.x;
        collisionRect.height=size.y;

        if (moveWidthDirection){
            xKord = controller.getEndKord().x;
            yKord = controller.getEndKord().y;
        }

     }


    public void setMoveWidthDirection(boolean moveWidthDirection) {
        this.moveWidthDirection = moveWidthDirection;
    }

    public Rectangle getCollisionRect() {
        return collisionRect;
    }

    public void setCollisionRect(Rectangle collisionRect) {
        this.collisionRect = collisionRect;
    }
}
