package exo;

import java.util.ArrayList;
import java.util.List;

// Enumération pour le degré de propreté
enum Cleanliness {
    BAD, CORRECT, GOOD
}

// Classe pour représenter un enclos
public class Enclos<T extends Creature> {
    private String name;
    private double area;
    private int maxCapacity;
    private int currentCount;
    private List<T> creatures;
    private Cleanliness cleanliness;

    public Enclos(String name, double area, int maxCapacity, Cleanliness cleanliness) {
        this.name = name;
        this.area = area;
        this.maxCapacity = maxCapacity;
        this.cleanliness = cleanliness;
        this.creatures = new ArrayList<>();
    }

    // Vérifier si une créature peut être ajoutée à l'enclos
    public boolean canAddCreature(T creature) {
        if (creature != null && creatures.size() < maxCapacity && creature.getClass().equals(creatures.get(0).getClass())) {
            return true;
        }
        return false;
    }

    // Ajouter une créature à l'enclos
    public void addCreature(T creature) {
        if (canAddCreature(creature)) {
            creatures.add(creature);
            currentCount++;
            System.out.println(creature.getSpecies() + " added to " + name + " enclos.");
        } else {
            System.out.println("Cannot add " + creature.getSpecies() + " to " + name + " enclos.");
        }
    }
    public void removeCreature(T creature) {
        if (creatures.remove(creature)) {
            currentCount--;
            System.out.println(creature.getSpecies() + " removed from " + name + " enclos.");
        }
    }

    public void feedCreatures() {
        for (T creature : creatures) {
            creature.eat();
        }
    }

    public void cleanEnclosure() {
        if (cleanliness == Cleanliness.BAD && creatures.isEmpty()) {
            cleanliness = Cleanliness.CORRECT;
            System.out.println(name + " enclosure has been cleaned.");
        }
    }

    public void displayCharacteristics() {
        System.out.println("Enclos: " + name);
        System.out.println("Area: " + area + " sq. meters");
        System.out.println("Max Capacity: " + maxCapacity);
        System.out.println("Current Count: " + currentCount);
        System.out.println("Cleanliness: " + cleanliness);
        System.out.println("Creatures:");
        for (T creature : creatures) {
            System.out.println(" - " + creature.getSpecies() + " (Age: " + creature.getAge() + ")");
        }
    }
}

