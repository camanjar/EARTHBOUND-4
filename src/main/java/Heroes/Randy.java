package main.java.Heroes;

public class Randy extends Hero {

    String asciiArt = (",-.___,-.\n" +
            "\\_/_ _\\_/\n" +
            "  )O_O(\n" +
            " { (_) }\n" +
            "  `-^-'   ");

    public Randy() {
        setHP(150.00);
        setName("RANDY");
        setWeapon("bite");
        setImage(asciiArt);
        setPhysDamage(100.00);
        setSpecDamage(20.00);
    }
}
