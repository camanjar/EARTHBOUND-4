package main.java.Villains;

/**
 * The main purpose of ToolShop is the makeTool() function.
 *
 * This function creates tools for the user through the ToolBuilder interface
 * constructing tools with randomized descriptions.
 *
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

    //Function construct tools through toolBuilder
    public void makeLayer() {
        layerBuilder.initRoster();
        layerBuilder.buildLayerColor();
        layerBuilder.buildLayerStrength();
        layerBuilder.buildLayerType();
    }
}
