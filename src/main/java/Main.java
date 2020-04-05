package main.java;

import main.java.Heroes.*;
import main.java.Villains.*;
import main.java.Villains.Characters.EnemySpawnner;

import javax.sound.sampled.*;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Random;
//


/**
 *
 *
 */

public class Main {

    private static Random rand = new SecureRandom();
    public static int randInt(int min, int max) {
        // Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void main(String[] args) throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException {

        Ness ness = new Ness();
        Paula paula = new Paula();
        //Randy randy = new Randy();

        /////////////// INTRODUCING GAME TO PLAYER ///////////////
        Intro intro = new Intro();
        intro.getAsciiArt();
        playSound("titlescreen.wav");
        intro.getSummary();
        TimeUnit.SECONDS.sleep(10);

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
        System.out.println("Ness and Paula walk into the first layer called " +
                baseOne.getColor() + " " +  baseOne.getType() + " " + baseOne.getStrength());
        waitTime(4);
        System.out.println("Ness is back in action!");
        ness.displayVillain();
        waitTime(2);
        System.out.println(baseOne.getRoster().get(0).getImage());
        System.out.println(baseOne.getRoster().get(0).getName() + " appeared!");
        System.out.println("Starting HP: " + baseOne.getRoster().get(0).getHP());
        waitTime(2);
        battle(ness, baseOne.getRoster().get(0), true);

        /////////////////////
        //Scenario 2
        ////////////////////
        waitTime(5);
        System.out.println("Ness and Paula walk into the second layer called " +
                baseTwo.getColor() + " " +  baseTwo.getType() + " " + baseTwo.getStrength());
        waitTime(4);
        System.out.println("Paula takes the lead!");
        paula.displayVillain();
        waitTime(2);
        System.out.println(baseTwo.getRoster().get(0).getImage());
        System.out.println(baseTwo.getRoster().get(0).getName() + " appeared!");
        System.out.println("Starting HP: " + baseTwo.getRoster().get(0).getHP());
        waitTime(2);
        battle(paula, baseTwo.getRoster().get(0), false);

        /////////////////////
        //Scenario 3
        ////////////////////
        waitTime(5);
        System.out.println("Ness and Paula walk into the second layer called " +
                baseThree.getColor() + " " +  baseThree.getType() + " " + baseThree.getStrength());
        waitTime(4);
        System.out.println("Ness encounters another villain!");
        ness.displayVillain();
        waitTime(2);
        System.out.println(baseThree.getRoster().get(0).getImage());
        System.out.println(baseThree.getRoster().get(0).getName() + " appeared!");
        System.out.println("Starting HP: " + baseThree.getRoster().get(0).getHP());
        waitTime(2);
        battle(ness, baseThree.getRoster().get(0), true);
        waitTime(3);

        /////////////////////
        // End of Simulation
        /////////////////////

        intro.goodBye();
    }

    public static synchronized void playSound(final String url) {
        new Thread(new Runnable() {
            // The wrapper thread is unnecessary, unless it blocks on the
            // Clip finishing; see comments.
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

    public static void waitTime(int n) throws InterruptedException {
        TimeUnit.SECONDS.sleep(n);
    }

    public static boolean battle(Hero h, EnemySpawnner e, boolean heroTurn) throws InterruptedException {

        double originalHP = e.getHP(); //For resetting to future spawns

        while (e.getHP() >= 1 && h.getHP() >= 1) {

            int damage = randInt(0, (int) h.getPhysDamage());
            h.attack(damage);
            e.setHP(e.getHP() - damage);
            if (heroTurn) {
                playSound("attack1.wav");
            } else {
                playSound("hpsuck.wav");
            }
                waitTime(2);

            int evildamage = randInt(0, (int) e.getPhysDamage()); //TODO: Get correct number
            e.attack(evildamage);
            h.setHP(h.getHP()- evildamage);
            playSound("enemyhit.wav");
            waitTime(2);

            if (h.getHP() < 0) {
                h.setHP(0);
            } else if (e.getHP() < 0) {
                e.setHP(0);
            }

            System.out.println("\nCurrent HP:\n" +
                    h.getName() + ": " + h.getHP() + "\n" +
                    e.getName() + ": " + e.getHP() + "\n");
        }
        if (h.getHP() != 0) {
            System.out.println(h.getName() + " won the battle!");
            playSound("eb_winboss.wav");
            waitTime(5);
            e.setHP(originalHP); //Resets in case of repeated villains
            return true;
        } else {
            System.out.println("Game over...");
            waitTime(2);
            return false;
            }
        }
    }