package main.java.Villains.Characters;

public class SmellyGhost extends EnemySpawnner {

    String asciiArt = (" .-.\n" +
            "(o o) boo!\n" +
            "| O \\\n" +
            " \\   \\\n" +
            "  `~~~'");

    public EvilMushroom() {
        setHP(10.00);
        setName("SMELLY GHOST");
        setImage(asciiArt);
        setPhysDamage(1.00);
        setSpecDamageDamage(5.00);
    }

}
