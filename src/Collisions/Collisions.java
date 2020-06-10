package Collisions;
import GameObject.Player;
import GameObject.Wall;
import ImageLoader.ImageLoader;

public class Collisions {


    public static boolean isThereCollision(Player player, Wall wall){
        if(player.getCollisionRect().overlaps(wall.getCollisionRect())){
            if(ImageLoader.text==ImageLoader.wallTexture){
                return false;
            }
            else if(ImageLoader.text==ImageLoader.wall2Texture){return true;}
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



