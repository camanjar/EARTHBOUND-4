package main.java.heroes;

public class Paula extends Hero {

    String asciiArt = ("            _._ \n"
            +
            "           ///\\\\ \n"
            +
            "          //. .|\\\n"
            +
            "         //\\_-_/\\\\\n"
            +
            "         \\/`'-'`\\/\n"
            +
            "         /_|   |_\\\n"
            +
            "          \\\\___//\n"
            +
            "          /\\) (/\\\n"
            +
            "         /_______\\\n"
            +
            "           |_|_|\n"
            +
            "          (__/__)");

    /**
     * Creates protagonist PAULA.
     */
    public Paula() {
        setHp(150.00);
        setName("PAULA");
        setWeapon("PK Fire");
        setImage(asciiArt);
        setPhysDamage(100.00);
        setSpecDamage(35.00);
    }

    @Override
    public double getSpecDamage() {
        return 35.00;
    }
}
