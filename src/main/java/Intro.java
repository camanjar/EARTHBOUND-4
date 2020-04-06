package main.java;

import java.util.concurrent.TimeUnit;

public class Intro {

    public Intro() {

    }

    private String asciiArt =
            ("  ______          _____ _______ _    _ ____   ____  _    _ _   _ _____  \n"
                    +
            " |  ____|   /\\   |  __ \\__   __| |  | |  _ \\ / __ \\| |  | | \\ | |  __ \\ \n"
                    +
            " | |__     /  \\  | |__) | | |  | |__| | |_) | |  | | |  | |  \\| | |  | |\n"
                    +
            " |  __|   / /\\ \\ |  _  /  | |  |  __  |  _ <| |  | | |  | | . ` | |  | |\n"
                    +
            " | |____ / ____ \\| | \\ \\  | |  | |  | | |_) | |__| | |__| | |\\  | |__| |\n"
                    +
            " |______/_/    \\_\\_|  \\_\\ |_|  |_|  |_|____/ \\____/ \\____/|_| \\_|_____/");

    public void getAsciiArt() {
        System.out.println(asciiArt);
    }

    /**
     * Prints introduction for user game.
     * @throws InterruptedException Exception or time units.
     */
    public void getSummary() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\nThe world has been lost.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Porky's evil regime has compromised Onette...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("It is up to Ness and his friends to save it!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Does Ness have what it takes...?\n");
    }

    /**
     * Prints goodbye message to the user.
     * @throws InterruptedException Exception for time units.
     */
    public void goodBye() throws InterruptedException {
        System.out.println("\n\nNess and his friends have saved Onette!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n\nThank you for watching!");
        System.out.println("___________.__        \n"
                +
                "\\_   _____/|__| ____  \n"
                +
                " |    __)  |  |/    \\ \n"
                +
                " |     \\   |  |   |  \\\n"
                +
                " \\___  /   |__|___|  /\n"
                +
                "     \\/            \\/ ");
    }
}
