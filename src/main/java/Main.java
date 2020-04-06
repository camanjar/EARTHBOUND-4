package main.java;

import java.io.IOException;
import java.security.SecureRandom;

import java.util.Random;

import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import main.java.heroes.Hero;
import main.java.heroes.Ness;
import main.java.heroes.Paula;
import main.java.villains.EnemyFactory;
import main.java.villains.EvilLayer;
import main.java.villains.LayerEngineer;
import main.java.villains.LayerShop;
import main.java.villains.characters.EnemySpawnner;

/**
 * Main file for showing off Factory/Builder patterns
 *<p></p>
 * Three layers are created which can hold many villains. For
 * the sake of this simulation, Ness, Paula, and Randy will
 * go to one layer at a time and battle a villain generated
 * through the builder pattern and battle it off.
 * <p></p>
 * After three battles, Ness and his friends win the game.
 */
public class Main {

    private static Random rand = new SecureRandom();

    /**
     * Helper function for randomizing numbers
     * for random layer/villain generation.
     * @param min 0.
     * @param max 1-max.
     * @return random number.
     */
    public static int randInt(int min, int max) {
        // Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    /**
     *  Main function, begins simulation.
     * @param args None.
     * @throws InterruptedException na.
     * @throws LineUnavailableException na.
     * @throws IOException na.
     * @throws UnsupportedAudioFileException na.
     */
    public static void main(String[] args) throws InterruptedException,
            LineUnavailableException, IOException, UnsupportedAudioFileException {

        final Ness ness = new Ness();
        final Paula paula = new Paula();
        //Randy randy = new Randy();

        /////////////// INTRODUCING GAME TO PLAYER ///////////////
        Intro intro = new Intro();
        intro.getAsciiArt();
        playSound("titlescreen.wav");
        intro.getSummary();

        /////////////////////////////////////
        // SCENE 1: Layers & Enemies Created
        /////////////////////////////////////

        // BUILDER DESIGN PATTERN --> Evil Layers
        LayerEngineer evilLayer = new LayerEngineer();
        LayerShop layerShop = new LayerShop(evilLayer);

        layerShop.makeLayer();
        EvilLayer baseOne = layerShop.getTool();

        LayerEngineer evilLayer2 = new LayerEngineer();
        LayerShop layerShop2 = new LayerShop(evilLayer2);
        layerShop2.makeLayer();
        EvilLayer baseTwo = layerShop2.getTool();

        LayerEngineer evilLayer3 = new LayerEngineer();
        LayerShop layerShop3 = new LayerShop(evilLayer3);
        layerShop3.makeLayer();
        EvilLayer baseThree = layerShop3.getTool();


        // FACTORY DESIGN PATTERN --> Enemy Spawning
        EnemyFactory villainsFactory = new EnemyFactory();

        EnemySpawnner enemySpawnner1 = villainsFactory.makeEnemy("1");
        baseOne.layerRoster.add(enemySpawnner1);

        EnemySpawnner enemySpawnner2 = villainsFactory.makeEnemy("2");
        baseTwo.layerRoster.add(enemySpawnner2);

        EnemySpawnner enemySpawnner3 = villainsFactory.makeEnemy("5");
        baseThree.layerRoster.add(enemySpawnner3);

        /////////////////////
        //Scenario 1
        ////////////////////
        waitTime(5);
        System.out.println("Ness and Paula walk into the first layer called "
                +
                baseOne.getColor()
                + " "
                +  baseOne.getType()
                + " "
                + baseOne.getStrength());
        waitTime(4);
        System.out.println("Ness gets ready to fight!");
        ness.displayVillain();
        waitTime(2);
        System.out.println(baseOne.getRoster().get(0).getImage());
        System.out.println(baseOne.getRoster().get(0).getName() + " appeared!");
        System.out.println("Starting HP: " + baseOne.getRoster().get(0).getHp());
        waitTime(2);
        battle(ness, baseOne.getRoster().get(0), true);

        /////////////////////
        //Scenario 2
        ////////////////////
        waitTime(5);
        System.out.println("\n\nNess and Paula walk into the second layer called "
                + baseTwo.getColor() + " "
                + baseTwo.getType() + " "
                + baseTwo.getStrength());
        waitTime(4);
        System.out.println("Paula takes the lead!");
        paula.displayVillain();
        waitTime(2);
        System.out.println(baseTwo.getRoster().get(0).getImage());
        System.out.println(baseTwo.getRoster().get(0).getName() + " appeared!");
        System.out.println("Starting HP: " + baseTwo.getRoster().get(0).getHp());
        waitTime(2);
        battle(paula, baseTwo.getRoster().get(0), false);

        /////////////////////
        //Scenario 3
        ////////////////////
        waitTime(5);
        System.out.println("\n\nNess and Paula walk into the third layer called "
                + baseThree.getColor() + " "
                + baseThree.getType() + " "
                + baseThree.getStrength());
        waitTime(4);
        System.out.println("Ness encounters another villain!");
        ness.displayVillain();
        waitTime(2);
        System.out.println(baseThree.getRoster().get(0).getImage());
        System.out.println(baseThree.getRoster().get(0).getName() + " appeared!");
        System.out.println("Starting HP: " + baseThree.getRoster().get(0).getHp());
        waitTime(2);
        battle(ness, baseThree.getRoster().get(0), true);
        waitTime(3);

        /////////////////////
        // End of Simulation
        /////////////////////

        intro.goodBye();
    }

    /**
     * Helper function to play .wav files in resources folder.
     * @param url Path to wav file.
     */
    public static synchronized void playSound(final String url) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            Main.class.getResourceAsStream("/ui/sound/" + url));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }

    /**
     * Helper function for simulation time control.
     * @param n Seconds.
     * @throws InterruptedException Error with time library.
     */
    public static void waitTime(int n) throws InterruptedException {
        TimeUnit.SECONDS.sleep(n);
    }

    /**
     * Helper function: Initiates battle between two characters.
     * @param h hero.
     * @param e villain.
     * @param heroTurn Checks to see if it is Paula's or Ness's turn.
     * @return Returns true if hero wins, false if not.
     * @throws InterruptedException na.
     */
    public static boolean battle(Hero h, EnemySpawnner e,
                                 boolean heroTurn) throws InterruptedException {

        double originalhp = e.getHp(); //For resetting to future spawns

        while (e.getHp() >= 1 && h.getHp() >= 1) {

            int damage = randInt(0, (int) h.getPhysDamage());
            h.attack(damage);
            e.setHp(e.getHp() - damage);
            if (heroTurn) {
                playSound("attack1.wav");
            } else {
                playSound("hpsuck.wav");
            }

            waitTime(2);

            int evildamage = randInt(0, (int) e.getPhysDamage());
            e.attack(evildamage);
            h.setHp(h.getHp() - evildamage);
            playSound("enemyhit.wav");
            waitTime(2);

            if (h.getHp() < 0) {
                h.setHp(0);
            } else if (e.getHp() < 0) {
                e.setHp(0);
            }

            System.out.println("\nCurrent HP:\n"
                    + h.getName() + ": " + h.getHp() + "\n"
                    + e.getName() + ": " + e.getHp() + "\n");
        }
        if (h.getHp() != 0) {
            System.out.println(h.getName() + " won the battle!");
            playSound("eb_winboss.wav");
            waitTime(5);
            e.setHp(originalhp); //Resets in case of repeated villains
            return true;
        } else {
            System.out.println("Game over...");
            waitTime(2);
            return false;
        }
    }
}