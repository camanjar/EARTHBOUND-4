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
        setImage(asciiDisplay);
        setPhysDamage(1.00);
        setSpecDamageDamage(5.00);
    }
}
