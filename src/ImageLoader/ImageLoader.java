package ImageLoader;//oyun içerisndeki görsellerin eklendiği sınıf

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
public class ImageLoader {
    public static Texture text,playerTexture,pointTex,wallTexture,wall2Texture,wall3Texture,wall4Texture,
            wall5texture,MenuBg,button,button2,backButton,icon,icon2,icon3,icon4,icon5;
    public static TextureRegion textReg,MenuBgReg,iconReg,icon2Reg,icon3Reg,icon4Reg,icon5Reg;
    public static TextureRegion wallReg,wall2Reg,wall3Reg,wall4Reg,wall5Reg,playerRegion,ButtonRegion,button2Region,backButtonRegion,pointReg;
    public static BitmapFont font;
    public static Texture fontTexture;

        public static void load(){
            font=new BitmapFont(Gdx.files.internal("font.fnt"),true);
            font.getData().setScale(3);
            fontTexture=new Texture(Gdx.files.internal("font.png"));
            fontTexture.setFilter(Texture.TextureFilter.Nearest,Texture.TextureFilter.Nearest);

            MenuBg=new Texture(Gdx.files.internal("colorful.jpg"));
            MenuBgReg=new TextureRegion(MenuBg,0,0,328,302);
            MenuBgReg.flip(false,true);
            
            icon=new Texture(Gdx.files.internal("1s.png"));
            icon2=new Texture(Gdx.files.internal("2s.png"));
            icon3=new Texture(Gdx.files.internal("3s.png"));
            icon4=new Texture(Gdx.files.internal("4s.png"));
            icon5=new Texture(Gdx.files.internal("5s.png"));

            iconReg=new TextureRegion(icon,0,0,250,250);
            iconReg.flip(false,true);

            icon2Reg=new TextureRegion(icon2,0,0,250,250);
            icon2Reg.flip(false,true);

            icon3Reg=new TextureRegion(icon3,0,0,250,250);
            icon3Reg.flip(false,true);

            icon4Reg=new TextureRegion(icon3,0,0,250,250);
            icon4Reg.flip(false,true);

            icon5Reg=new TextureRegion(icon5,0,0,250,250);
            icon5Reg.flip(false,true);

            wallTexture=new Texture(Gdx.files.internal("1.jpg"));
            wall2Texture=new Texture(Gdx.files.internal("2.jpg"));
            wall3Texture=new Texture(Gdx.files.internal("3.jpg"));
            wall4Texture=new Texture(Gdx.files.internal("6.jpg"));
            wall5texture=new Texture(Gdx.files.internal("7.jpg"));

            pointTex=wallTexture;
            pointReg=new TextureRegion(pointTex,0,0,250,250);
            pointReg.flip(false,true);

            text = wallTexture; //player
            textReg=new TextureRegion(text,0,0,50,50);
            playerRegion=new TextureRegion(text,0,0,50,50);

            wallReg=new TextureRegion(wallTexture,0,0,250,250);
            wallReg.flip(false,true);

            wall2Reg=new TextureRegion(wall2Texture,0,0,250,250);
            wall2Reg.flip(false,true);

            wall3Reg=new TextureRegion(wall3Texture,0,0,250,250);
            wall3Reg.flip(false,true);

            wall4Reg=new TextureRegion(wall4Texture,0,0,250,250);
            wall4Reg.flip(false,true);

            wall5Reg=new TextureRegion(wall5texture,0,0,250,250);
            wall5Reg.flip(false,true);

            button=new Texture(Gdx.files.internal("play.png"));
            ButtonRegion=new TextureRegion(button,0,0,280,92);
            ButtonRegion.flip(false,true);

            button2=new Texture(Gdx.files.internal("tutorial.png"));
            button2Region=new TextureRegion(button2,0,0,346,99);
            button2Region.flip(false,true);

            backButton=new Texture(Gdx.files.internal("back.png"));
            backButtonRegion=new TextureRegion(backButton,0,0,330,175);
            backButtonRegion.flip(false,true);
        }
        public static void changePoint(int i){
            if(i==0){
                pointTex=wall2Texture;
            }
            else if(i==1){
                pointTex=wall3Texture;
            }
            else if(i==2){
                pointTex=wall4Texture;
            }
            else if(i==3){
                pointTex=wall5texture;
            }
            else if(i==4){
                pointTex=wallTexture;
            }
        }
    
        public static void change(int i){//gelen parametreye göre playerin renklerini değiştiren fonksiyon
            if (i==0){
                text =wall3Texture;
                textReg=new TextureRegion(text,0,0,50,50);
                playerRegion=new TextureRegion(text,0,0,50,50);
            }
            else if (i==1){
                text =wallTexture;
                textReg=new TextureRegion(text,0,0,50,50);
                playerRegion=new TextureRegion(text,0,0,50,50);
            }
            else if (i==2){
                text =wall2Texture;
                textReg=new TextureRegion(text,0,0,50,50);
                playerRegion=new TextureRegion(text,0,0,50,50);
            }
            else if (i==3){
                text =wall5texture;
                textReg=new TextureRegion(text,0,0,50,50);
                playerRegion=new TextureRegion(text,0,0,50,50);
            }
            else if (i==4){
                text =wall4Texture;
                textReg=new TextureRegion(text,0,0,50,50);
                playerRegion=new TextureRegion(text,0,0,50,50);
            }
        }
        public static void dispose(){//oyunun yok edildiği libgdx methodu
            font.dispose();
            fontTexture.dispose();
            text.dispose();
            playerTexture.dispose();
            wallTexture.dispose();
        }
}
