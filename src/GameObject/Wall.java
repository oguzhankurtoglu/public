package GameObject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import ImageLoader.ImageLoader;
import States.PlayState;

public class Wall implements GameObject {

    private Vector2 position,position2,position3,position4,position5;
    private Vector2 size,size2,size3,size4,size5;
    private Vector2 speed;
    private Rectangle collisionRect,collision2Rect,collision3Rect,collision4Rect,collision5Rect;


    public Wall(float x2Kord, float y2Kord ,float x4Kord,float y4Kord,float xKord,float yKord,float x5Kord,
                float y5Kord,float x3Kord,float y3Kord)
    {
        position=new Vector2();
        position2=new Vector2();
        position3=new Vector2();
        position4=new Vector2();
        position5=new Vector2();
        size=new Vector2(220,220);
        size2=new Vector2(220,220);
        size3=new Vector2(220,220);
        size4=new Vector2(220,220);
        size5=new Vector2(220,220);
        speed=new Vector2(0,400);

        collisionRect=new Rectangle(position.x,position.y,size.x,size.y);
        collision2Rect=new Rectangle(position2.x,position2.y,size2.x,size2.y);
        collision3Rect=new Rectangle(position3.x,position3.y,size3.x,size3.y);
        collision4Rect=new Rectangle(position4.x,position4.y,size4.x,size4.y);
        collision5Rect=new Rectangle(position5.x,position5.y,size5.x,size5.y);

        position.x=xKord;
        position.y=yKord;
        position2.x=x2Kord;
        position2.y=y2Kord;
        position3.x=x3Kord;
        position3.y=y3Kord;
        position4.x=x4Kord;
        position4.y=y4Kord;
        position5.x=x5Kord;
        position5.y=y5Kord;
    }

    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(ImageLoader.wallTexture,position.x,position.y,size.x,size.y);
        sb.draw(ImageLoader.wall2Texture,position2.x,position2.y,size2.x,size2.y);
        sb.draw(ImageLoader.wall3Texture,position3.x,position3.y,size3.x,size3.y);
        sb.draw(ImageLoader.wall4Texture,position4.x,position4.y,size4.x,size4.y);
        sb.draw(ImageLoader.wall5texture,position5.x,position5.y,size5.x,size5.y);
        sb.end();
    }
    public void update(float delta) {
        collisionRect.x=position.x;
        collisionRect.y=position.y;
        collisionRect.width=size.x;
        collisionRect.height=size.y;

        collision2Rect.x=position2.x;
        collision2Rect.y=position2.y;
        collision2Rect.width=size2.x;
        collision2Rect.height=size2.y;

        collision3Rect.x=position3.x;
        collision3Rect.y=position3.y;
        collision3Rect.width=size3.x;
        collision3Rect.height=size3.y;

        collision4Rect.x=position4.x;
        collision4Rect.y=position4.y;
        collision4Rect.width=size4.x;
        collision4Rect.height=size4.y;

        collision5Rect.x=position5.x;
        collision5Rect.y=position5.y;
        collision5Rect.width=size5.x;
        collision5Rect.height=size5.y;

        position.add(speed.cpy().scl(delta));
        position2.add(speed.cpy().scl(delta));
        position3.add(speed.cpy().scl(delta));
        position4.add(speed.cpy().scl(delta));
        position5.add(speed.cpy().scl(delta));

        if(PlayState.getSayac()>1000){
            speed=new Vector2(0,1000);
        }else if(PlayState.getSayac()>750){
            speed=new Vector2(0,750);

        }else if(PlayState.getSayac()>400){
            speed=new Vector2(0,600);

        }
        else if(PlayState.getSayac()>150){
            speed=new Vector2(0,500);

        }


    }



    public Rectangle getCollisionRect() {
        return collisionRect;
    }

    public void setCollisionRect(Rectangle collisionRect) {
        this.collisionRect = collisionRect;
    }

    public Rectangle getCollision2Rect() {
        return collision2Rect;
    }

    public void setCollision2Rect(Rectangle collision2Rect) {
        this.collision2Rect = collision2Rect;
    }

    public Rectangle getCollision3Rect() {
        return collision3Rect;
    }

    public void setCollision3Rect(Rectangle collision3Rect) {
        this.collision3Rect = collision3Rect;
    }

    public Rectangle getCollision4Rect() {
        return collision4Rect;
    }

    public void setCollision4Rect(Rectangle collision4Rect) {
        this.collision4Rect = collision4Rect;
    }

    public Rectangle getCollision5Rect() {
        return collision5Rect;
    }

    public void setCollision5Rect(Rectangle collision5Rect) {
        this.collision5Rect = collision5Rect;
    }

}
