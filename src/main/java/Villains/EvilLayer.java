package main.java.Villains;

import main.java.Villains.Characters.EnemySpawnner;

import java.util.ArrayList;

/**
 * Implements ToolPlan
 *
 * Provides type, color, and strength attribute descriptions to ToolPlan.
 * These String values will be modified further by NookBuilder and ToolShop
 *
 * @author camanjar
 */
public class EvilLayer implements LayerPlan {

    public ArrayList<EnemySpawnner> layerRoster;
    private String type; //Axe, Shovel, Ladder, etc.
    private String color;
    private String strength; //Strong, weak, etc.

    //Getters & Setters

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getStrength() {
        return strength;
    }

    public ArrayList<EnemySpawnner> getRoster() {
        return layerRoster;
    }

    @Override
    public void setLayerColor(String col) {
        color = col;
    }

    @Override
    public void setLayerType(String t) {
        type = t;
    }

    @Override
    public void setLayerStrength(String str) {
        strength = str;
    }

}
