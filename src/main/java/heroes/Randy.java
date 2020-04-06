package main.java.heroes;

public class Randy extends Hero {

    String asciiArt = (",-.___,-.\n"
            +
            "\\_/_ _\\_/\n"
            +
            "  )O_O(\n"
            +
            " { (_) }\n"
            +
            "  `-^-'   ");

    /**
     * Creates the character RANDY.
     */
    public Randy() {
        setHp(150.00);
        setName("RANDY");
        setWeapon("bite");
        setImage(asciiArt);
        setPhysDamage(100.00);
        setSpecDamage(20.00);
    }
}
