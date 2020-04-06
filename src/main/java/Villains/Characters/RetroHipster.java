package main.java.Villains.Characters;

public class RetroHipster extends EnemySpawnner{

    String asciiArt = ("      ///0 \\\\\\\n" +
            "      |      |\n" +
            "     @ []-[]— @\n" +
            "      |  ~   |         \\__\n" +
            "       \\ -- /          |\\ |\n" +
            "     ___||||___        | \\|\n" +
            "    /   \\  /   \\      /|__|\n" +
            "   /     (@)    \\    / /\n" +
            "  /  /|      |\\  \\  / /\n" +
            " /  / |      | \\  \\/ /");
    public RetroHipster() {
        setHP(20.00);
        setName("RETRO HIPSTER");
        setWeapon("bitter kombucha");
        setImage(asciiArt);
        setPhysDamage(3.00);
        setSpecDamage(10.00);
    }
}
