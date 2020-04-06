package main.java.villains.characters;

public class Starman extends EnemySpawnner {

    String asciiDisplay = ("                       .-.\n"
            +
            "        .-\"\"`\"\"-.    |(@ @)\n"
            +
            "     _/`oOoOoOoOo`\\_ \\ \\-/\n"
            +
            "    '.-=-=-=-=-=-=-.' \\/ \\\n"
            +
            "      `-=.=-.-=.=-'    \\ /\\\n"
            +
            "         ^  ^  ^       _H_ \\");

    /**
     * Creates STARMAN villain, an alien from space.
     */
    public Starman() {
        setHp(100.00);
        setName("STARMAN");
        setImage(asciiDisplay);
        setWeapon("a weird laser gun");
        setPhysDamage(20.00);
        setSpecDamage(15.00);
    }
}
