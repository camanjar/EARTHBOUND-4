package main.java.Villains;

public abstract class EnemySpawnner {

    private String name;
    private String image; //ASCII illustrations
    private double physDamage;
    private double specDamage;

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
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
