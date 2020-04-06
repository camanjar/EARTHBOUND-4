

import main.java.Villains.*;
import main.java.Heroes.*;
import main.java.Villains.Characters.EnemySpawnner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Testing classes in main.java for maximum coverage.
 *
 * Tests are created to test if implemented Builder design was
 * constructed appropriately returning expected values. This also
 * ensures Villains and Layer objects are constructed properly for
 * the main file to make sense.
 *
 * @author camanjar
 */
public class VillainsHeroesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(32);
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream(32);
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    //EVIL LAYER (BUILDER)
    LayerEngineer evilLayer;
    LayerShop layerShop;
    EvilLayer baseOne;

    //VILLAINS (FACTORY)
    EnemyFactory villainsFactory = new EnemyFactory();
    EnemySpawnner enemySpawnner1 = villainsFactory.makeEnemy("1"); //Retro Hipster
    String hipsterImage = ("      ///0 \\\\\\\n" +
            "      |      |\n" +
            "     @ []-[]— @\n" +
            "      |  ~   |         \\__\n" +
            "       \\ -- /          |\\ |\n" +
            "     ___||||___        | \\|\n" +
            "    /   \\  /   \\      /|__|\n" +
            "   /     (@)    \\    / /\n" +
            "  /  /|      |\\  \\  / /\n" +
            " /  / |      | \\  \\/ /");

    @Before
    public void setUp() throws Exception {

        evilLayer = new LayerEngineer();
        layerShop = new LayerShop(evilLayer);

        layerShop.makeLayer();
        baseOne = layerShop.getTool();
        baseOne.layerRoster.add(enemySpawnner1);

        try {
            //System.setOut(new PrintStream(Arrays.toString(outContent.toByteArray())));
            //System.setErr(new PrintStream(Arrays.toString(errContent.toByteArray())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void checkVillainHP() {
        Assert.assertEquals(20, (int) baseOne.getRoster().get(0).getHP());
    }

    @Test
    public void checkVillainName() {
        Assert.assertEquals("RETRO HIPSTER", baseOne.getRoster().get(0).getName());
    }

    @Test
    public void checkVillainWeapon() {
        Assert.assertEquals("bitter kombucha", baseOne.getRoster().get(0).getWeapon());
    }

    @Test
    public void checkVillainImage() {
        Assert.assertEquals(hipsterImage, baseOne.getRoster().get(0).getImage());
    }

    @Test
    public void checkVillainPhysDmg() {
        Assert.assertEquals(3, (int) baseOne.getRoster().get(0).getPhysDamage());
    }

    @Test
    public void checkVillainSpecDmg() {
        Assert.assertEquals(10, (int) baseOne.getRoster().get(0).getSpecDamage());
    }

    @Test
    public void checkVillainCreation() {
        EnemySpawnner enemySpawnner2 = villainsFactory.makeEnemy("5");
        baseOne.layerRoster.add(enemySpawnner2);
        Assert.assertEquals("STARMAN", baseOne.getRoster().get(1).getName());
        baseOne.getRoster().get(1).displayVillain();
        Assert.assertNotNull(outContent.toString(32));
        baseOne.getRoster().get(1).attack(2);
        Assert.assertNotNull(outContent.toString(32));

        EnemySpawnner enemySpawnner3 = villainsFactory.makeEnemy("4");
        baseOne.layerRoster.add(enemySpawnner3);
        Assert.assertEquals("SMELLY GHOST", baseOne.getRoster().get(2).getName());
        EnemySpawnner enemySpawnner4 = villainsFactory.makeEnemy("3");
        baseOne.layerRoster.add(enemySpawnner4);
        Assert.assertEquals("EVIL MUSHROOM", baseOne.getRoster().get(3).getName());
        EnemySpawnner enemySpawnner5 = villainsFactory.makeEnemy("2");
        baseOne.layerRoster.add(enemySpawnner5);
        Assert.assertEquals("SMELLY GHOST", baseOne.getRoster().get(4).getName());
        EnemySpawnner enemySpawnner6 = villainsFactory.makeEnemy("30");
        baseOne.layerRoster.add(enemySpawnner6);
        Assert.assertEquals("EVIL MUSHROOM", baseOne.getRoster().get(5).getName());
    }

    @Test
    public void checkLayerCreation() {
        EvilLayer baseTwo;
        evilLayer = new LayerEngineer();
        layerShop = new LayerShop(evilLayer);
        layerShop.makeLayer();
        baseTwo = layerShop.getTool();
        baseTwo.layerRoster.add(enemySpawnner1);
        Assert.assertNotNull(baseTwo);
    }

    @Test
    public void checkLayerDescription() {
        Assert.assertNotNull(baseOne.getType());
        Assert.assertNotNull(baseOne.getColor());
        Assert.assertNotNull(baseOne.getStrength());
    }

    @Test
    public void checkHeroes() {

        Paula paula;
        Ness ness;
        Randy randy;

        paula = new Paula();
        Assert.assertNotNull(paula);
        Assert.assertEquals(35, (int) paula.getSpecDamage());
        Assert.assertEquals("PAULA", paula.getName());
        Assert.assertNotNull(paula.getImage());
        Assert.assertEquals(100, (int) paula.getPhysDamage());
        Assert.assertEquals(150, (int) paula.getHP());
        Assert.assertEquals("PK Fire", paula.getWeapon());

        ness = new Ness();
        Assert.assertNotNull(ness);
        Assert.assertEquals(82, (int) ness.getPhysDamage());
        Assert.assertEquals(35, (int) ness.getSpecDamage());
        ness.displayVillain();
        Assert.assertNotNull(outContent.toString(32));
        ness.attack(2);
        Assert.assertNotNull(outContent.toString(32));

        randy = new Randy();
        Assert.assertNotNull(randy);

    }
}
