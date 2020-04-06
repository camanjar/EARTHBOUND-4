package main.java.villains.characters;

public class SmellyGhost extends EnemySpawnner {

    String asciiArt = (" .-.\n"
            +
            "(o o) boo!\n"
            +
            "| O \\\n"
            +
            " \\   \\\n"
            +
            "  `~~~'");

    /**
     * Creates SMELLY GHOST, a ghost born from
     * haunted farts.
     */
    public SmellyGhost() {
        setHp(40.00);
        setName("SMELLY GHOST");
        setImage(asciiArt);
        setWeapon("a loud screech");
        setPhysDamage(18.00);
        setSpecDamage(34.00);
    }
}
