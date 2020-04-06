package main.java.Villains.Characters;

public abstract class EnemySpawnner {

    protected double HP;
    protected String name;
    protected String weapon;
    protected String image; //ASCII illustrations
    protected double physDamage;
    protected double specDamage;

    protected EnemySpawnner() { };

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

    public void attack(double n) {
        System.out.println(name + " attacks with " + weapon + " and inflicts " + n + " damage!");
    }

}
