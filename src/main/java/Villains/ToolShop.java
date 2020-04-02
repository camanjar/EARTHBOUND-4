package main.java.Villains;

/**
 * The main purpose of ToolShop is the makeTool() function.
 *
 * This function creates tools for the user through the ToolBuilder interface
 * constructing tools with randomized descriptions.
 *
 * @author camanjar
 */
public class ToolShop {

    private ToolBuilder toolBuilder;

    public ToolShop(ToolBuilder t) {
        toolBuilder = t;
    }

    public Tool getTool() {

        return this.toolBuilder.getTool();
    }

    //Function construct tools through toolBuilder
    public void makeTool() {
        toolBuilder.buildToolColor();
        toolBuilder.buildToolStrength();
        toolBuilder.buildToolType();
    }

}
