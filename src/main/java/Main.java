package main.java;

import main.java.Heroes.*;
import main.java.Villains.*;
import main.java.Villains.Characters.EnemySpawnner;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Random;
//


/**
 * TODO: Have villains spawn in layers (will hold arrayList of villains)
 * TODO: Finish battle sequence
 */

public class Main {

    public static void main(String[] args) throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException {

        Random random = new Random();

        EnemyFactory villainsFactory = new EnemyFactory();
        EnemySpawnner enemySpawnner = null;

        System.out.println("NESS encounters an enemy!");

        String enemyType = Integer.toString(random.nextInt(5));
        enemySpawnner = villainsFactory.makeEnemy(enemyType);

        TimeUnit.SECONDS.sleep(2);
        Ness ness = new Ness();
        ness.displayVillain();
        playSound("hpsuck.wav");

        TimeUnit.SECONDS.sleep(3);

        enemySpawnner = villainsFactory.makeEnemy(enemyType);

        if (enemySpawnner != null) {
            doStuff(enemySpawnner);
            playSound("enemyhit.wav");
        }

        TimeUnit.SECONDS.sleep(3);

        ness.attack();
        playSound("attack1.wav");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("NESS wins the battle!");
        playSound("eb_winboss.wav");
        TimeUnit.SECONDS.sleep(3);
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
}

