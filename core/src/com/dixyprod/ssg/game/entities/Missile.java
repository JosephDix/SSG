package com.dixyprod.ssg.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Dixy on 04/03/2016.
 */
public class Missile extends Projectile {
    public Missile(float xPos, float yPos, float xSpeed, float ySpeed, float maxVelocity, int structureIntegrity, int
            armourIntegrity, int shieldIntegrity, String uniqueId, float direction, boolean onScreen, boolean alive,
                   Alignment alignment, EntityTypes entityTypes, Texture entityTexture, Sprite entitySprite) {
        super(xPos, yPos, xSpeed, ySpeed, maxVelocity, structureIntegrity, armourIntegrity, shieldIntegrity,
                uniqueId, direction, onScreen, alive, alignment, entityTypes, entityTexture, entitySprite);
    }
}
