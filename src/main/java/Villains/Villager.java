package main.java.Villains;

/**
 * The Villager class is a blueprint for the characters used in
 * the Main runner folder. Each villager has a unique name and
 * a tool they pick randomly.
 *
 * @author camanjar
 */
public class Villager {

    private String name;
    private Tool tool; //Axe, shovel, etc.

    public Villager(String n, Tool t) {
        name = n;
        tool = t;
    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
