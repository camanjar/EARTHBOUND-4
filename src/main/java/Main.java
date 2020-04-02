package main.java;

import main.java.Villains.*;


public class Main {

    public static void main(String[] args) {

        VillainsFactory villainsFactory = new VillainsFactory(Villains.BOWSER);
        villainsFactory.catchPhrase();
    }
}
