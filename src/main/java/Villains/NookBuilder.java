package main.java.Villains;

import java.util.Random;

/**
 * Implementation of NookBuilder
 *
 * @author camanjar
 */
public class NookBuilder implements ToolBuilder {

    private Tool tool;
    private Random random = new Random(); //Used to create random tools

    private String[] colors = {"pink", "blue", "plaid", "green", "crystal", "yellow"};
    private String[] type = {"axe", "shovel", "fishing rod", "net", "shovel", "ladder"};
    private  String[] strength = {"weak", "strong", "weird"};

    public NookBuilder() {
        tool = new Tool();
    }

    // Getters & Setters

    @Override
    public void buildToolColor() {
        tool.setToolColor(colors[RandomIndex(colors.length)]);
    }

    @Override
    public void buildToolType() {
        tool.setToolType(type[RandomIndex(type.length)]);
    }

    @Override
    public void buildToolStrength() {

        tool.setToolStrength(strength[RandomIndex(strength.length)]);
    }


    public Tool getTool() {
        return tool;
    }

    private int RandomIndex(int max) {
        return (int) (random.nextInt(max));
    }

}
