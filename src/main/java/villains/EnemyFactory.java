package main.java.villains;

import main.java.villains.characters.EnemySpawnner;
import main.java.villains.characters.EvilMushroom;
import main.java.villains.characters.RetroHipster;
import main.java.villains.characters.SmellyGhost;
import main.java.villains.characters.Starman;

public class EnemyFactory {

    /**
     * Uses Factory DP method to create characters below,
     * including ghosts, hipsters, and aliens.
     * @param newEnemy Number represents which enemy will spawn
     * @return new enemy.
     */
    public EnemySpawnner makeEnemy(String newEnemy) {

        EnemySpawnner e = null;

        if (newEnemy.equalsIgnoreCase("1")) {

            return new RetroHipster();

        } else if (newEnemy.equalsIgnoreCase("2")) {

            return new SmellyGhost();

        } else if (newEnemy.equalsIgnoreCase("3")) {

            return new EvilMushroom();

        } else if (newEnemy.equalsIgnoreCase("4")) {

            return new SmellyGhost();

        } else if (newEnemy.equalsIgnoreCase("5")) {

            return new Starman();

        } else {

            System.out.println("That was not a choice, so we will pick for you!");
            return new EvilMushroom();
        }
    }
}
