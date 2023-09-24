
public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal eagle = new Animal("Phasianidae", "Chicken", 2, true);

        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 10);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(eagle);
        myZoo.displayZoo();

        System.out.println("\nAnimaux au zoo :");
        myZoo.displayAnimals();
        String searchName = "Lion";
        int animalIndex = myZoo.searchAnimal(searchName);
        if (animalIndex != -1) {
            System.out.println("Lion Trouvé à l'index: " + animalIndex);
        } else {
            System.out.println("Animal introuvable.");
        }

        myZoo.removeAnimal(lion);
        myZoo.displayAnimals();
    }
}