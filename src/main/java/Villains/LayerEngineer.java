package main.java.Villains;

import java.util.Random;

/**
 * Implementation of NookBuilder
 *
 * @author camanjar
 */
public class LayerEngineer implements LayerBuilder {

    private EvilLayer evilLayer;
    private Random random = new Random(); //Used to create random tools

    private String[] colors = {"pink", "blue", "plaid", "green", "crystal", "yellow"};
    private String[] type = {"axe", "shovel", "fishing rod", "net", "shovel", "ladder"};
    private  String[] strength = {"weak", "strong", "weird"};

    public LayerEngineer() {
        evilLayer = new EvilLayer();
    }

    // Getters & Setters

    @Override
    public void buildToolColor() {
        evilLayer.setToolColor(colors[RandomIndex(colors.length)]);
    }

    @Override
    public void buildToolType() {
        evilLayer.setToolType(type[RandomIndex(type.length)]);
    }

    @Override
    public void buildToolStrength() {

        evilLayer.setToolStrength(strength[RandomIndex(strength.length)]);
    }


    public EvilLayer getEvilLayer() {
        return evilLayer;
    }

    private int RandomIndex(int max) {
        return (int) (random.nextInt(max));
    }

}
