package GameObject;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import ImageLoader.ImageLoader;
import States.PlayState;

public class Point implements GameObject {

    private Vector2 position;
    private Vector2 size;
    private Vector2 speed;
    private Rectangle collisionRect;


    public Point(float xKord, float yKord)
    {

        position=new Vector2();

        size=new Vector2(220,220);

        speed=new Vector2(0,400);



        collisionRect= new Rectangle();



        position.x=xKord;
        position.y=yKord;




    }

    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(ImageLoader.pointTex,position.x,position.y,size.x,size.y);

        sb.end();
    }


    public void update(float delta) {
        collisionRect.x=position.x;
        collisionRect.y=position.y;
        collisionRect.width=size.x;
        collisionRect.height=size.y;

        position.add(speed.cpy().scl(delta));



    }



    public Rectangle getCollisionRect() {
        return collisionRect;
    }

    public void setCollisionRect(Rectangle collisionRect) {
        this.collisionRect = collisionRect;
    }






}
