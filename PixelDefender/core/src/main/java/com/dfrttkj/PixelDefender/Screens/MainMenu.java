package com.dfrttkj.PixelDefender.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.dfrttkj.PixelDefender.MainGame;
import com.sun.tools.javac.Main;

public class MainMenu implements Screen {
    private MainGame game;

    private SpriteBatch batch;
    private Texture image;

    public MainMenu(MainGame game) {
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        

        if (Gdx.input.justTouched()){
            game.GOTOgameScreen();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
