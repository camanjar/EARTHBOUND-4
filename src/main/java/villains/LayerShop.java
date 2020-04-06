package main.java.villains;

/**
 * The main purpose of ToolShop is the makeTool() function.
 *<p></p>
 * This function creates tools for the user through the ToolBuilder interface
 * constructing tools with randomized descriptions.
 *<p></p>
 * @author camanjar
 */
public class LayerShop {

    private LayerBuilder layerBuilder;

    public LayerShop(LayerBuilder t) {
        layerBuilder = t;
    }

    public EvilLayer getTool() {

        return this.layerBuilder.getEvilLayer();
    }

    /**
     * Generates different layers.
     */
    public void makeLayer() {
        layerBuilder.initRoster();
        layerBuilder.buildLayerColor();
        layerBuilder.buildLayerStrength();
        layerBuilder.buildLayerType();
    }
}
