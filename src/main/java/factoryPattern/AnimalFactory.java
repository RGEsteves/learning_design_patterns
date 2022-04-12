package factoryPattern;

public class AnimalFactory {
    public Animal getAnimal(AnimalType animalType) {
        if (animalType == null){
            return null;
        }
        if (animalType.equals(AnimalType.FISH)){
            return new Fish();
        }else if (animalType.equals(AnimalType.DOG)){
            return new Dog();
        }else if (animalType.equals(AnimalType.BIRD)){
            return new Bird();
        }else{
            return null;
        }
    }
}
