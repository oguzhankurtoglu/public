package Collisions;
import GameObject.Player;
import GameObject.Wall;
import ImageLoader.ImageLoader;

public class Collisions {
    public static boolean isThereCollision(Player player, Wall wall){//Player ile duvarın çarpışma durumunu tüm olasılıklarıyla inceleyen sınıf.
        if(player.getCollisionRect().overlaps(wall.getCollisionRect())){//player'in sınırları ile duvarın sınırlarının temas etme durumunu kontrol eder.
            if(ImageLoader.text==ImageLoader.wallTexture){//eğer çarpışma varsa;player rengi ile duvarın rengini kotrol eder. aynı ise false değer ve oyun akmaya devam eder
                return false;
            }
            else if(ImageLoader.text==ImageLoader.wall2Texture){return true;}//player rengi ile duvar rengi aynı değilse true değer döner ve çarpışma gerçekleşir.
            else if(ImageLoader.text==ImageLoader.wall3Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wall4Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wall5texture){return true;}
        }
        else if(player.getCollisionRect().overlaps(wall.getCollision2Rect())){
            if(ImageLoader.text==ImageLoader.wall2Texture){
                return false;
            }
            else if(ImageLoader.text==ImageLoader.wallTexture){return true;}
            else if(ImageLoader.text==ImageLoader.wall3Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wall4Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wall5texture){return true;}
        }
        else if(player.getCollisionRect().overlaps(wall.getCollision3Rect())){
            if(ImageLoader.text==ImageLoader.wall3Texture){
                return false;
            }
            else if(ImageLoader.text==ImageLoader.wall2Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wallTexture){return true;}
            else if(ImageLoader.text==ImageLoader.wall4Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wall5texture){return true;}
        }
        else if(player.getCollisionRect().overlaps(wall.getCollision4Rect())){
            if(ImageLoader.text==ImageLoader.wall4Texture){
                return false;
            }
            else if(ImageLoader.text==ImageLoader.wall2Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wall3Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wallTexture){return true;}
            else if(ImageLoader.text==ImageLoader.wall5texture){return true;}
        }
        else if(player.getCollisionRect().overlaps(wall.getCollision5Rect())){
            if(ImageLoader.text==ImageLoader.wall5texture){
                return false;
            }
            else if(ImageLoader.text==ImageLoader.wall2Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wall3Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wall4Texture){return true;}
            else if(ImageLoader.text==ImageLoader.wallTexture){return true;}
        }
        return  false;
    }
}
