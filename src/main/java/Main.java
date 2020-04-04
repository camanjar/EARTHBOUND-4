package main.java;

import main.java.Heroes.*;
import main.java.Villains.*;
import main.java.Villains.Characters.EnemySpawnner;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import java.util.Random;
//import java.util.Scanner;


/**
 * TODO: Have villains spawn in layers (will hold arrayList of villains)
 * TODO: Finish battle sequence
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        EnemyFactory villainsFactory = new EnemyFactory();
        EnemySpawnner enemySpawnner = null;

        System.out.println("Which enemy would you like?");

        String enemyType = Integer.toString(random.nextInt(5));
        enemySpawnner = villainsFactory.makeEnemy(enemyType);

        TimeUnit.SECONDS.sleep(2);
        Ness ness = new Ness();
        ness.displayVillain();

        TimeUnit.SECONDS.sleep(3);

        enemySpawnner = villainsFactory.makeEnemy(enemyType);

//        enemyType = "3";
//        enemySpawnner = villainsFactory.makeEnemy(enemyType);

        if (enemySpawnner != null) {
            doStuff(enemySpawnner);
        }

        TimeUnit.SECONDS.sleep(3);

        ness.attack();
    }

    public static void doStuff(EnemySpawnner e) {
        e.displayVillain();
        System.out.println(e.getName());
        System.out.println(e.getHP());
        System.out.println(e.getPhysDamage());
        System.out.println(e.getSpecDamage());
        e.attack();
    }
}

