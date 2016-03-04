package com.dixyprod.ssg.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.dixyprod.ssg.util.Constants;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.dixyprod.ssg.util.Constants;

/**
 * Created by Dixy on 23/02/2016.
 */
public class WorldRenderer {
    private OrthographicCamera camera;
    public static Texture backgroundTexture;
    public static Sprite backgroundSprite;
    private SpriteBatch batch;
    private WorldController worldController;
    private int tileCount = 3;
    float x,y;
    float offsetX,offsetY;
    float bgWidth, bgHeight, bgOffsetX,bgOffsetY;


    public WorldRenderer(WorldController worldController) {
        this.worldController = worldController;
        init();
    }

    private void init() {
        batch = new SpriteBatch();
        camera = new OrthographicCamera(Constants.VIEWPORT_WIDTH,
                Constants.VIEWPORT_HEIGHT);
        camera.position.set(0, 0, 0);
        camera.update();

        backgroundTexture = new Texture(Gdx.files.internal("core/assets/space.png"));
        backgroundSprite = new Sprite(backgroundTexture);
        backgroundSprite.setSize(15.0f, 15.0f);
        backgroundSprite.setPosition(-7.5f,-7.5f);
        bgWidth = backgroundSprite.getWidth();
        bgHeight = backgroundSprite.getHeight();
        bgOffsetX = backgroundSprite.getWidth()/2;
        bgOffsetY = backgroundSprite.getHeight()/2;


    }

    public void render() {
        renderTestObjects();
    }

    private void renderTestObjects() {
        worldController.cameraHelper.applyTo(camera);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();

        x = worldController.testSprites[worldController.selectedSprite].getX();
        y = worldController.testSprites[worldController.selectedSprite].getY();

        offsetX = (Math.round(x/bgWidth)*bgWidth);
        offsetY = (Math.round(y/bgHeight) *bgHeight);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                backgroundSprite.setPosition(((i-1)*bgWidth)-bgOffsetX+offsetX,((j-1)*bgHeight)-bgOffsetY+offsetY);
                backgroundSprite.draw(batch);
            }
        }

        worldController.testSprites[worldController.selectedSprite].getX();

        for(Sprite sprite : worldController.testSprites) {
            sprite.draw(batch);
        }
        batch.end();
    }

    public void resize(int width, int height) {
        camera.viewportWidth = (Constants.VIEWPORT_HEIGHT / height) *
                width;
        camera.update();
    }

    //@Override
    public void dispose() {
        batch.dispose();
    }

}
