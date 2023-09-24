import java.util.ArrayList;
import java.util.List;
class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    private List<Animal> animalsList = new ArrayList<>();

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.toString());
            }
        }
    }

    public boolean addAnimal(Animal animal) {
        if (!animalsList.contains(animal)) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    animalsList.add(animal);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                System.out.println("Supprimer un animal: " + animal.name + "\n");
                animals[i] = null;
                animalsList.remove(animal);
                return true;
            }
        }
        return false;
    }

    public int searchAnimal(String animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal)) {
                return i;
            }
        }
        return -1;
    }
}