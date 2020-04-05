package main.java;

import main.java.Heroes.*;
import main.java.Villains.*;
import main.java.Villains.Characters.EnemySpawnner;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Random;
//


/**
 * TODO: Have villains spawn in layers (will hold arrayList of villains)
 * TODO: Finish battle sequence
 */

public class Main {

    private static Random random = new Random(); //Randomizes creation of enemies

    public static void main(String[] args) throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException {

        Ness ness = new Ness();
        //Paula paula = new Paula();
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

        layerShop.makeLayer();
        EvilLayer baseTwo = layerShop.getTool();

        layerShop.makeLayer();
        EvilLayer baseThree = layerShop.getTool();


        // FACTORY DESIGN PATTERN --> Enemy Spawning

        EnemyFactory villainsFactory = new EnemyFactory();

        EnemySpawnner enemySpawnner1 = null;
        String enemyType = Integer.toString(random.nextInt(5));
        enemySpawnner1 = villainsFactory.makeEnemy(enemyType);
        baseOne.layerRoster.add(enemySpawnner1);

        EnemySpawnner enemySpawnner2 = null;
        String enemyType2 = Integer.toString(random.nextInt(5));
        enemySpawnner2 = villainsFactory.makeEnemy(enemyType2);
        baseTwo.layerRoster.add(enemySpawnner2);

        EnemySpawnner enemySpawnner3 = null;
        String enemyType3 = Integer.toString(random.nextInt(5));
        enemySpawnner3 = villainsFactory.makeEnemy(enemyType3);
        baseThree.layerRoster.add(enemySpawnner3);


        waitTime(5);
        System.out.println("Ness and Paula walk into the first layer called " +
                baseOne.getColor() + " " + baseOne.getStrength() + " " + baseOne.getType());
        waitTime(4);
        System.out.println("Ness encounters a villain!");
        ness.displayVillain();
        waitTime(2);
        System.out.println(baseOne.getRoster().get(0).getImage());
        System.out.println(baseOne.getRoster().get(0).getHP());
        waitTime(2);
        battle(ness, baseOne.getRoster().get(0), true);



    }

    public static void doStuff(EnemySpawnner e) {
        e.displayVillain();
        System.out.println(e.getName());
        System.out.println(e.getHP());
        System.out.println(e.getPhysDamage());
        System.out.println(e.getSpecDamage());
        e.attack();
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
        while (e.getHP() >= 1 || h.getHP() >= 1) {
            if (heroTurn) {
                h.attack();
                e.setHP(e.getHP() - random.nextInt((int) e.getPhysDamage()));
                playSound("attack1.wav");
                waitTime(2);
            }
            e.attack();
            h.setHP(h.getHP()- random.nextInt((int) e.getPhysDamage()));
            playSound("enemyhit.wav");
            waitTime(2);
        }
        if (h.getHP() != 0) {
            System.out.println(h.getName() + " won the battle!");
            playSound("eb_winboss.wav");
            waitTime(5);
            return true;
        } else {
            System.out.println("Game over...");
            waitTime(2);
            return false;
            }
        }
    }


//        System.out.println("NESS encounters an enemy!");
//

//
//        TimeUnit.SECONDS.sleep(2);
//        Ness ness = new Ness();
//        ness.displayVillain();
//        playSound("hpsuck.wav");
//
//        TimeUnit.SECONDS.sleep(3);
//
//        enemySpawnner = villainsFactory.makeEnemy(enemyType);
//
//        if (enemySpawnner != null) {
//            doStuff(enemySpawnner);
//            playSound("enemyhit.wav");
//        }
//
//        TimeUnit.SECONDS.sleep(3);
//
//        ness.attack();
//        playSound("attack1.wav");
//        TimeUnit.SECONDS.sleep(2);
//        System.out.println("NESS wins the battle!");
//        playSound("eb_winboss.wav");
//        TimeUnit.SECONDS.sleep(3);
//