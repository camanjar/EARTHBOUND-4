package main.java.Villains.Characters;

public class EvilMushroom extends EnemySpawnner {

    String asciiDisplay = ("  .-\"\"\"-.\n" +
            " /* * * *\\\n" +
            ":_.-:`:-._;\n" +
            "    (_)\n" +
            " \\|/(_)\\|/");

    public EvilMushroom() {
        setHP(10.00);
        setName("EVIL MUSHROOM");
        setWeapon("spores");
        setImage(asciiDisplay);
        setPhysDamage(1.00);
        setSpecDamage(5.00);
    }
}
