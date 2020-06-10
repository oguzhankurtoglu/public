package com.kurtoglu.renk;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ImageLoader.ImageLoader;
import States.MenuState;
import States.PlayState;
import States.StateManeger;

public class RenkBombasi extends Game {
    public static final String TITLE = "RenkBombasi";
    private SpriteBatch sb;
private static StateManeger sm;//direk erişim sağlamak için static

    public void create() {//oyunun yaratıldıgı method
        ImageLoader.load();
        sb=new SpriteBatch();
        sm=new StateManeger();
        sm.pushState(new MenuState(sm));


    }
    public void render(){//oyunun çizildiği method
        Gdx.gl.glClearColor(156/255f,156/255f,156/255f,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        if(PlayState.getSayac()>1000){
            Gdx.gl.glClearColor(0, 0, 0, 0);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        }else if(PlayState.getSayac()>750){
            Gdx.gl.glClearColor(54/255f, 54/255f, 54/255f, 0);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        }else if(PlayState.getSayac()>400){
            Gdx.gl.glClearColor(79/255f, 79/255f, 79/255f, 0);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        }
        else if(PlayState.getSayac()>150){
            Gdx.gl.glClearColor(130/255f, 130/255f, 130/255f, 0);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        }
        sm.render(sb);
        sm.update(Gdx.graphics.getDeltaTime());
    }

    public void dispose() {//oyunun yok edildiği method
        super.dispose();
        ImageLoader.dispose();
    }
}
