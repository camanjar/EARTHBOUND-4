package main.java.Villains.Characters;

public abstract class EnemySpawnner {

    private  double HP;
    private String name;
    private String image; //ASCII illustrations
    private double physDamage;
    private double specDamage;

    protected EnemySpawnner() {
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getHP() {
        return name;
    }

    public void setHP (double hp) {
        this.HP = hp;
    }

    public String getImage() {
        return image;
    }

    public void setImage (String image) {
        this.image = image;
    }

    public double getPhysDamage() {
        return physDamage;
    }

    public void setPhysDamage(double physDamage) {
        this.physDamage = physDamage;
    }

    public double getSpecDamage() {
        return physDamage;
    }

    public void setSpecDamageDamage(double physDamage) {
        this.physDamage = physDamage;
    }

    public void displayVillain() {
        System.out.println(image);
    }

    public void attack() {
        System.out.println(name + " attack and does " + physDamage);
    }

}
