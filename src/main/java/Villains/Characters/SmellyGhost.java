package main.java.Villains.Characters;

public class SmellyGhost extends EnemySpawnner {

    String asciiArt = (" .-.\n" +
            "(o o) boo!\n" +
            "| O \\\n" +
            " \\   \\\n" +
            "  `~~~'");

    public SmellyGhost() {
        setHP(10.00);
        setName("SMELLY GHOST");
        setImage(asciiArt);
        setWeapon("a loud screech");
        setPhysDamage(1.00);
        setSpecDamage(5.00);
    }

}
