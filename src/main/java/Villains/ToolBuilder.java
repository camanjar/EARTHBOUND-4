package main.java.Villains;

/**
 * ToolBuilder provides behavior allowing tools to
 * be constructed based on specific attributes.
 *
 * To be instantiated by NookBuilder
 * @author camanjar
 */
public interface ToolBuilder {

    public void buildToolColor();
    public void buildToolType();
    public void buildToolStrength();
    public Tool getTool();
}
