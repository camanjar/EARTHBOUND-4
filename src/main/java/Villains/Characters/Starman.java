package main.java.Villains.Characters;

public class Starman extends EnemySpawnner {

    String asciiDisplay = ("                       .-.\n" +
            "        .-\"\"`\"\"-.    |(@ @)\n" +
            "     _/`oOoOoOoOo`\\_ \\ \\-/\n" +
            "    '.-=-=-=-=-=-=-.' \\/ \\\n" +
            "      `-=.=-.-=.=-'    \\ /\\\n" +
            "         ^  ^  ^       _H_ \\");

    public Starman() {
        setHP(100.00);
        setName("STARMAN");
        setImage(asciiDisplay);
        setWeapon("a weird laser gun");
        setPhysDamage(20.00);
        setSpecDamage(15.00);
    }
}
