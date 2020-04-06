package main.java.villains;

import java.util.ArrayList;

import main.java.villains.characters.EnemySpawnner;

/**
 * Implements ToolPlan
 *<p></p>
 * Provides type, color, and strength attribute descriptions to ToolPlan.
 * These String values will be modified further by NookBuilder and ToolShop
 *<p></p>
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
