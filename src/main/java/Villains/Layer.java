package main.java.Villains;

/**
 * The Villager class is a blueprint for the characters used in
 * the Main runner folder. Each villager has a unique name and
 * a tool they pick randomly.
 *
 * @author camanjar
 */
public class Layer {

    private String name;
    private EvilLayer evilLayer; //Axe, shovel, etc.

    public Layer(String n, EvilLayer t) {
        name = n;
        evilLayer = t;
    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EvilLayer getEvilLayer() {
        return evilLayer;
    }

    public void setEvilLayer(EvilLayer evilLayer) {
        this.evilLayer = evilLayer;
    }
}
