package main.java.Villains;

public class VillainsFactory {

    Villains villains;

    public VillainsFactory(Villains v) {
        villains = v;
    }

    /**
     * STARMAN, EVIL_MUSHROOM, RETRO_HIPPIE, MOBILE_SPROUT, CULTIST,
     * TRICK_OR_TRICK, BRONZE_KNEECAP, TONALD_DRUMP, SMELLY_GHOST,
     * ATTACK_SLUG, COIL_SNAKE, BOWSER, PORKY
     */
    public void catchPhrase() {
        if (villains == Villains.STARMAN) {
            System.out.println("Bee boop! Your planet will be ours!");
        } else if (villains == Villains.EVIL_MUSHROOM) {
            System.out.println("Mushrooms cant talk, but it looks menacing...");
        } else if (villains == Villains.RETRO_HIPPIE) {
            System.out.println("Hey man you should seriously try this kombucha...");
        } else if (villains == Villains.MOBILE_SPROUT) {
            System.out.println("Plants cant talk, but it looks menacing!");
        } else if (villains == Villains.CULTIST) {
            System.out.println("I will paint EVERYTHING BLUE!");
        } else if (villains == Villains.TRICK_OR_TRICK) {
            System.out.println("Trick or Trick!");
        } else if (villains == Villains.BRONZE_KNEECAP) {
            System.out.println("You will be defeated!");
        } else if (villains == Villains.TONALD_DRUMP) {
            System.out.println("Fake news! You are fake news!");
        } else if (villains == Villains.SMELLY_GHOST) {
            System.out.println("OoooOOoooOOoooOOoo!");
        } else if (villains == Villains.ATTACK_SLUG) {
            System.out.println("Slime! Slime! Everything will be covered in slime!");
        } else if (villains == Villains.COIL_SNAKE) {
            System.out.println("Boing!");
        } else if (villains == Villains.BOWSER) {
            System.out.println("Wait... You're not Mario!");
        } else if (villains == Villains.PORKY) {
            System.out.println("Me meet again!");
        }
    }
}
