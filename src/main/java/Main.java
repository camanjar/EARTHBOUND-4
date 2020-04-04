package main.java;

import main.java.Villains.*;
import main.java.Villains.Characters.EnemySpawnner;
//import java.util.Scanner;


/**
 * TODO: Finish creating villains and layer using
 *      builder and factory (layer/characters)
 */

public class Main {

    public static void main(String[] args) {

        EnemyFactory villainsFactory = new EnemyFactory();
        EnemySpawnner enemySpawnner = null;

        //Scanner userInput = new Scanner(System.in);

        System.out.println("Which enemy would you like?");

        //if (userInput.hasNextLine()) {
            String enemyType = "1";
            enemySpawnner = villainsFactory.makeEnemy(enemyType);
        //}

        if (enemySpawnner != null) {
            doStuff(enemySpawnner);
        }


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

