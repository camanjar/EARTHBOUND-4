package main.java.villains.characters;

public class RetroHipster extends EnemySpawnner {

    String asciiArt = ("      ///0 \\\\\\\n"
            +
            "      |      |\n"
            +
            "     @ []-[]— @\n"
            +
            "      |  ~   |         \\__\n"
            +
            "       \\ -- /          |\\ |\n"
            +
            "     ___||||___        | \\|\n"
            +
            "    /   \\  /   \\      /|__|\n"
            +
            "   /     (@)    \\    / /\n"
            +
            "  /  /|      |\\  \\  / /\n"
            +
            " /  / |      | \\  \\/ /");

    /**
     * Creates RETRO HIPSTER, a guy who majors
     * in creative writing and only drinks weird coffee.
     */
    public RetroHipster() {
        setHp(20.00);
        setName("RETRO HIPSTER");
        setWeapon("bitter kombucha");
        setImage(asciiArt);
        setPhysDamage(3.00);
        setSpecDamage(10.00);
    }
}
