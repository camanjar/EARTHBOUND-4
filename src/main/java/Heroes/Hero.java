package main.java.Heroes;

public abstract class Hero {

    private double HP;
    private String name;
    private String weapon;
    private String image; //ASCII illustrations
    private double physDamage;
    private double specDamage;

    protected Hero() { };

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPhysDamage() {
        return physDamage;
    }

    public void setPhysDamage(double physDamage) {
        this.physDamage = physDamage;
    }

    public double getSpecDamage() {
        return specDamage;
    }

    public void setSpecDamage(double specDamage) {
        this.specDamage = specDamage;
    }

    public void displayVillain() {
        System.out.println(image);
    }

    public void attack() {
        System.out.println(name + " attacks with " + weapon + " and does " + physDamage + " damage!");
    }
}
