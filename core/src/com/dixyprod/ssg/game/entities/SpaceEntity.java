package com.dixyprod.ssg.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.dixyprod.ssg.util.Constants;

/**
 * Created by Dixy on 04/03/2016.
 */
public abstract class SpaceEntity {
    enum Alignment {
        FRIENDLY, NEUTRAL, HOSTILE
    };
    enum EntityTypes{
        PLAYER, PROJECTILE, NPC, STATION
    };

    float xPos, yPos;
    //float xOffset, yOffset;
    float xSpeed, ySpeed;
    float maxVelocity;
    int structureIntegrity, armourIntegrity, shieldIntegrity;
    String uniqueId;
    float direction;
    boolean onScreen;
    boolean alive;
    Alignment alignment;
    EntityTypes entityTypes;

    Texture entityTexture;
    Sprite entitySprite;

    //update the integrity (health) of an entity
    //shield integrity is depleted first, then armour and then structure
    //only shield integrity is rechargeable


    public SpaceEntity(float xPos, float yPos, float xSpeed, float ySpeed, float maxVelocity, int structureIntegrity,
                       int armourIntegrity, int shieldIntegrity, String uniqueId, float direction, boolean onScreen,
                       boolean alive, Alignment alignment, EntityTypes entityTypes, Texture entityTexture, Sprite
                               entitySprite) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.maxVelocity = maxVelocity;
        this.structureIntegrity = structureIntegrity;
        this.armourIntegrity = armourIntegrity;
        this.shieldIntegrity = shieldIntegrity;
        this.uniqueId = uniqueId;
        this.direction = direction;
        this.onScreen = onScreen;
        this.alive = alive;
        this.alignment = alignment;
        this.entityTypes = entityTypes;
        this.entityTexture = entityTexture;
        this.entitySprite = entitySprite;
    }

    public boolean updateIntegrity(int modifier) {
        if (modifier < 0) { // condition if integrity reduced
            if (this.structureIntegrity == 0) {
                return false;
            } else if (this.armourIntegrity == 0) {
                this.structureIntegrity += modifier;
                if (this.structureIntegrity < 0)
                    this.structureIntegrity = 0;
            } else if (this.shieldIntegrity == 0) {
                this.armourIntegrity += modifier;
                if (this.armourIntegrity < 0)
                    this.armourIntegrity = 0;
            } else {
                this.shieldIntegrity += modifier;
                if (this.shieldIntegrity < 0)
                    this.shieldIntegrity = 0;
            }
        } else { // else if integrity is increased, apply accordingly
            if (this.structureIntegrity < 100) {
                this.structureIntegrity += modifier;
            } else if (this.armourIntegrity < 100) {
                this.armourIntegrity += modifier;
            } else if (this.shieldIntegrity < 100) {
                this.shieldIntegrity += modifier;
            } else {

            }
        }
        if (this.structureIntegrity <= 0)
            return false;
        return true;
    }
    //hit detection, usually just called on the player for colliding with objects
    //there are some special cases
    //projectiles
    //space stations
    //NPCs not implemented yet / handled in player hit detection
    protected boolean hitDetection(float x, float y, float xOff, float yOff, EntityTypes from){
        //TODO write hit detection
         switch(from){
             case PLAYER:

                break;
             case PROJECTILE:

                break;
             case NPC:

                 break;
             case STATION:

                 break;
             default:
                 break;
         }

        return  false;
    }


}
