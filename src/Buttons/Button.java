package Buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;


import GameObject.GameObject;
import ImageLoader.ImageLoader;

public class Button implements GameObject {

    private Rectangle buttonRect;
    private TextureRegion buttonImages;
    private float xKord,yKord,width,height;

public Button(float xKord,float yKord,TextureRegion buttonImages){
    this.buttonImages=buttonImages;
    this.xKord=xKord;
    this.yKord=yKord;
        width=450;
        height=200;
        buttonRect=new Rectangle(xKord,yKord,width,height);

}

public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(buttonImages,xKord,yKord,width,height);
        sb.end();
    }


    public void update(float delta) {

    }

    public Rectangle getButtonRect() {
        return buttonRect;
    }

    public void setButtonRect(Rectangle buttonRect) {
        this.buttonRect = buttonRect;
    }
}
