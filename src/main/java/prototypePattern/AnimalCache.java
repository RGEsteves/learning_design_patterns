package prototypePattern;

import java.util.Hashtable;

public class AnimalCache {
    private static Hashtable<String, Animal> animalHashtable = new Hashtable<String, Animal>();

    public static Animal getAnimal(String animalId){
        Animal cachedAnimal = animalHashtable.get(animalId);
        return (Animal) cachedAnimal.clone();
    }

    // for each animal run database query and create animal
    // shapeMap.put(animalKey, animal);
    // for example, we are adding three animals
    public static void loadCache(){
        Bird bird = new Bird();
        bird.setId("1");
        animalHashtable.put(bird.getId(), bird);

        Dog dog = new Dog();
        dog.setId("2");
        animalHashtable.put(dog.getId(), dog);

        Fish fish = new Fish();
        fish.setId("3");
        animalHashtable.put(fish.getId(), fish);
    }
}
