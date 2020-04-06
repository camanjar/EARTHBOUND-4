package main.java.Villains;

import main.java.Villains.Characters.*;

public class EnemyFactory {

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
