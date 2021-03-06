package GameObject;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Random;
import Controller.Controller;

public class GameWorld implements GameObject {
    private Player player;
    private Wall wall;
    private Controller controller;
    int x,x2,x3,x4,x5;
    int yKord=-220;//duvarın ilk oluştuğu ekranın dışındaki y koordinatı
    Random rastgele = new Random();

    public GameWorld(){
        controller=new Controller(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()*4/5,75);//Controller sınıfı çağırıyorve gerekli parametreler giriliyor
        player =new Player(Gdx.graphics.getWidth()/2-50,Gdx.graphics.getHeight()/2,100,100,controller);//player sınıfı çağırılıyor ve gerekli parametreler giriliyor
    }
    public void render(SpriteBatch sb) {//player ve wall sürekli bir sekilde render sınıfı icerisinde çizdiriliyor
        player.render(sb);
        wall.render(sb);
    }
    public void update(float delta) {//player, controller, ve wall sınıfları ve anlık değişimleri sürekli olarak bu methodda güncelleniyor
        player.update(delta);
        controller.update(delta);
        wall.update(delta);
    }
    public void random(){//random methodu;birbirinden bağımsız 5 duvar için x koordinatları belirlidir. bu fonksiyon çağırıldığında bu koordinatlar bir dizi içerisinde yer değiştir ve duvarların yerinin değişmesini sağlar
        int sayi;
        int[] dizi = {99,99,99,99,99};
        for (int i=0;i<5;i++) {
            do {//birbirine benzemeyen 5 sayı rastgele diziye yerleştiren do while döngüsü
                sayi = rastgele.nextInt(5);
            } while (dizi[0] == sayi || dizi[1] == sayi || dizi[2] == sayi || dizi[3] == sayi || dizi[4] == sayi);
            dizi[i] = sayi;
        }
        for(int i=0;i<5;i++){// rastgele gelen sayılara göre koordinatları karışık bi şekilde diziye aktarn for döngüsü
            if(dizi[i]==1){
                dizi[i]=660;
            }
            if(dizi[i]==2){
                dizi[i]=880;
            }
            if(dizi[i]==3){
                dizi[i]=220;
            }
            if(dizi[i]==4){
                dizi[i]=01;
            }
            if(dizi[i]==0){
                dizi[i]=440;
            }
        }
        x=dizi[0];//her duvarın x koordinatı belirlenir ve karıştırma işlemi tamamlanır
        x2=dizi[1];
        x3=dizi[2];
        x4=dizi[3];
        x5=dizi[4];
    }
    public void initWalls(){//duvar çağırma metodu
        random();//random metodu çağırılır ve renkleri rastgele bir dizilimle bir sıra duvar oluşturulur
        wall=new Wall(x,yKord,x2,yKord,x3,yKord,x4,yKord,x5,yKord);
    }
    public Player getPlayer(){return player;}
    public Wall getWall(){return wall;}
    public Controller getController(){return controller;}

}
