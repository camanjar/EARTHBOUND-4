package main.java.Villains;

/**
 * Implements ToolPlan
 *
 * Provides type, color, and strength attribute descriptions to ToolPlan.
 * These String values will be modified further by NookBuilder and ToolShop
 *
 * @author camanjar
 */
public class EvilLayer implements LayerPlan {

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

    @Override
    public void setToolColor(String col) {
        color = col;
    }

    @Override
    public void setToolType(String t) {
        type = t;
    }

    @Override
    public void setToolStrength(String str) {
        strength = str;
    }

}
