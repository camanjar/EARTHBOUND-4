package main.java.villains.characters;

public class EvilMushroom extends EnemySpawnner {

    String asciiDisplay = ("  .-\"\"\"-.\n"
            +
            " /* * * *\\\n"
            +
            ":_.-:`:-._;\n"
            +
            "    (_)\n"
            +
            " \\|/(_)\\|/");

    /**
     * Creates EVIL MUSHROOM, a mushroom that
     * attacks with its spores.
     */
    public EvilMushroom() {
        setHp(40.00);
        setName("EVIL MUSHROOM");
        setWeapon("spores");
        setImage(asciiDisplay);
        setPhysDamage(1.00);
        setSpecDamage(5.00);
    }
}
