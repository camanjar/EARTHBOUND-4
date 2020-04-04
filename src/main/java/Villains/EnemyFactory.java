package main.java.Villains;

import main.java.Villains.Characters.EnemySpawnner;
import main.java.Villains.Characters.EvilMushroom;
import main.java.Villains.Characters.RetroHipster;
import main.java.Villains.Characters.SmellyGhost;

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

        } else {

            System.out.println("That was not a choice, so we will pick for you!");
            return new EvilMushroom();
        }

        return e;

    }
}
