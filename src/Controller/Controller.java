package Controller;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class Controller {// player'ın hareket etmesini sağlayan sınıf

    private float xKord;//playyerin bulunduğu konumu tutan x koordinat değeri
    private float yKord;//playyerin bulunduğu konumu tutan y koordinat değeri
    private  Vector2 endKord;// kullanıcının temas ettiği yüzeyin koordinatlerını tutan vektor
    private ShapeRenderer sr; 
    private OrthographicCamera camera;
    private boolean click=false;

    public Controller(float xKord,float yKord,float radius) {//Controller sınıfı için bir yapıcı method.
        this.xKord = xKord;
        this.yKord = yKord;
        this.radius = radius;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sr = new ShapeRenderer();
        sr.setProjectionMatrix(camera.combined);
        endKord = new Vector2();//
        endKord.x=xKord;//parametrelerden gelen değerler 
        endKord.y=yKord;
    }
    public void update ( float delta){//oyun ekranının sürekli güncellendiği libgdx methodu
        if (click){//eğer temas var ise yapılacak işlemler
            endKord.x=Gdx.input.getX();//endkord değişkenine kullanıcının dokunduğu noktanın koordinatlarını x ve y olarak atarız
            endKord.y=Gdx.input.getY();
        }
    }
    public Vector2 getEndKord() {//endKord bilgilerinin çağırılacağı get methodu
        return endKord;
    }
    public void setEndKord(Vector2 endKord) {
        this.endKord = endKord;
    }
    public boolean isClick() {//
        return click;
    }
    public void setClick(boolean click) {
        this.click = click;
    }
}
