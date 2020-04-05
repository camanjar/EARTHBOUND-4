package main.java.Villains;

/**
 * ToolBuilder provides behavior allowing tools to
 * be constructed based on specific attributes.
 *
 * To be instantiated by NookBuilder
 * @author camanjar
 */
public interface LayerBuilder {

    public void initRoster();
    public void buildLayerColor();
    public void buildLayerType();
    public void buildLayerStrength();
    public EvilLayer getEvilLayer();
}
