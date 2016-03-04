package com.dixyprod.ssg.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Dixy on 04/03/2016.
 */
public abstract class AiShip extends SpaceShip {
    public AiShip(float xPos, float yPos, float xSpeed, float ySpeed, float maxVelocity, int structureIntegrity, int
            armourIntegrity, int shieldIntegrity, String uniqueId, float direction, boolean onScreen, boolean alive,
                  Alignment alignment, EntityTypes entityTypes, Texture entityTexture, Sprite entitySprite, int
                          bulletAmmo, int missleAmmo, int maxBulletAmmo, int maxMissleAmmo, int numCannon, int
                          numMisslePod, float firing, int targetShipId, float targetDirection, float reloadingMissle,
                  float reloadingCannon, float shieldRegen, ShipType shipType) {
        super(xPos, yPos, xSpeed, ySpeed, maxVelocity, structureIntegrity, armourIntegrity, shieldIntegrity,
                uniqueId, direction, onScreen, alive, alignment, entityTypes, entityTexture, entitySprite,
                bulletAmmo, missleAmmo, maxBulletAmmo, maxMissleAmmo, numCannon, numMisslePod, firing, targetShipId,
                targetDirection, reloadingMissle, reloadingCannon, shieldRegen, shipType);
    }
}
