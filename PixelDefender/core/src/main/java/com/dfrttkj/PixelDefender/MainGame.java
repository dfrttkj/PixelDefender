package com.dfrttkj.PixelDefender;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.dfrttkj.PixelDefender.Screens.MainMenu;
import com.dfrttkj.PixelDefender.Screens.gameScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class MainGame extends Game {
    private Screen MainMenu;
    private Screen GameScreen;

    @Override
    public void create() {
        this.MainMenu = new MainMenu(this);
        this.GameScreen = new gameScreen(this);

        setScreen(MainMenu);
    }

    public void GOTOgameScreen() {
        setScreen(GameScreen);
    }

    @Override
    public void render() {
        /*
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(image, 140, 210);
        batch.end();
        */
    }

    @Override
    public void dispose() {
        /*
        batch.dispose();
        image.dispose();
         */
    }
}
