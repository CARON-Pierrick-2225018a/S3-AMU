package exo;

// Classe de base pour toutes les créatures
public class Creature {
    private String species;
    private String sex;
    private double weight;
    private double height;
    private int age;
    private boolean isHungry;
    private boolean isSleeping;
    private boolean isHealthy;

    public Creature(String species, String sex, double weight, double height, int age) {
        this.species = species;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.isHungry = false;
        this.isSleeping = false;
        this.isHealthy = true;
    }

    public void eat() {
        if (!isSleeping) {
            isHungry = false;
            System.out.println(species + " is eating.");
        } else {
            System.out.println(species + " is sleeping and cannot eat.");
        }
    }

    public void makeSound() {
        System.out.println(species + " is making a sound.");
    }

    public void heal() {
        isHealthy = true;
        System.out.println(species + " has been healed.");
    }

    public void sleep() {
        isSleeping = true;
        System.out.println(species + " is sleeping.");
    }

    public void wakeUp() {
        isSleeping = false;
        System.out.println(species + " woke up.");
    }

    public void age() {
        age++;
        if (age >= 10 || !isHealthy) {
            die();
        }
    }

    public void die() {
        System.out.println(species + " has died.");
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}

