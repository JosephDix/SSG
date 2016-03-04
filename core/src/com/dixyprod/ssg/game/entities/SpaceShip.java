package com.dixyprod.ssg.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Dixy on 04/03/2016.
 */
public abstract class SpaceShip extends SpaceEntity {
    enum ShipType {
        PLAYERSHIP, FRIGATE, CRUISER, BATTLESHIP
    }

    //int shipType;
    int bulletAmmo, missleAmmo;
    int maxBulletAmmo, maxMissleAmmo;
    int numCannon, numMisslePod;
    float firing;
    int targetShipId;
    float targetDirection;
    float reloadingMissle;
    float reloadingCannon;
    float shieldRegen;
    ShipType shipType;

    public SpaceShip(float xPos, float yPos, float xSpeed, float ySpeed, float maxVelocity, int structureIntegrity,
                     int armourIntegrity, int shieldIntegrity, String uniqueId, float direction, boolean onScreen,
                     boolean alive, Alignment alignment, EntityTypes entityTypes, Texture entityTexture, Sprite
                             entitySprite, int bulletAmmo, int missleAmmo, int maxBulletAmmo, int maxMissleAmmo, int
                             numCannon, int numMisslePod, float firing, int targetShipId, float targetDirection,
                     float reloadingMissle, float reloadingCannon, float shieldRegen, ShipType shipType) {
        super(xPos, yPos, xSpeed, ySpeed, maxVelocity, structureIntegrity, armourIntegrity, shieldIntegrity,
                uniqueId, direction, onScreen, alive, alignment, entityTypes, entityTexture, entitySprite);
        this.bulletAmmo = bulletAmmo;
        this.missleAmmo = missleAmmo;
        this.maxBulletAmmo = maxBulletAmmo;
        this.maxMissleAmmo = maxMissleAmmo;
        this.numCannon = numCannon;
        this.numMisslePod = numMisslePod;
        this.firing = firing;
        this.targetShipId = targetShipId;
        this.targetDirection = targetDirection;
        this.reloadingMissle = reloadingMissle;
        this.reloadingCannon = reloadingCannon;
        this.shieldRegen = shieldRegen;
        this.shipType = shipType;
    }

    //TODO write "weapon firing" code
}
