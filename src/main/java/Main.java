package main.java;

import main.java.Villains.*;

/**
 * TODO: Finish creating villains and layer using
 *      builder and factory (layer/characters)
 */

public class Main {

    public static void main(String[] args) {

        VillainsFactory villainsFactory = new VillainsFactory(Villains.EVIL_MUSHROOM);
        villainsFactory.catchPhrase();

        VillainsFactory villainsFactory2 = new VillainsFactory(Villains.STARMAN);
        villainsFactory2.catchPhrase();

        VillainsFactory villainsFactory3 = new VillainsFactory(Villains.MOBILE_CACTUS);
        villainsFactory3.catchPhrase();

    }


}

