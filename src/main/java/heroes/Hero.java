package main.java.heroes;

public abstract class Hero {

    private double hp;
    private String name;
    private String weapon;
    private String image; //ASCII illustrations
    private double physDamage;
    private double specDamage;

    protected Hero() { }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
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
        System.out.println(name + " attacks with "
                + weapon + " and does inflicts " + n + " damage!");
    }
}
