package main.java.Villains;

public class EnemyFactory {

    public EnemySpawnner makeEnemy(String newEnemy) {

        EnemySpawnner e = null;

        if (newEnemy.equalsIgnoreCase("1")) {

        } else if (newEnemy.equalsIgnoreCase("2")) {

        } else if (newEnemy.equalsIgnoreCase("3")) {

        } else if (newEnemy.equalsIgnoreCase("4")) {

        } else if (newEnemy.equalsIgnoreCase("5")) {

        } else if (newEnemy.equalsIgnoreCase("6")) {

        } else if (newEnemy.equalsIgnoreCase("7")) {

        } else {

        }

        return e;

    }
}
