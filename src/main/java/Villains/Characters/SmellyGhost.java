package main.java.Villains.Characters;

public class SmellyGhost extends EnemySpawnner {

    String asciiArt = (" .-.\n" +
            "(o o) boo!\n" +
            "| O \\\n" +
            " \\   \\\n" +
            "  `~~~'");

    public SmellyGhost() {
        setHP(40.00);
        setName("SMELLY GHOST");
        setImage(asciiArt);
        setWeapon("a loud screech");
        setPhysDamage(18.00);
        setSpecDamage(34.00);
    }
}
