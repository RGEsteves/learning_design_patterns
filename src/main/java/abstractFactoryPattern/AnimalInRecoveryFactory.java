package abstractFactoryPattern;

public class AnimalInRecoveryFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(AnimalType animalType) {
        if (animalType == null){
            return null;
        }
        if (animalType.equals(AnimalType.FISH)){
            return new FishInRecovery();
        }else if (animalType.equals(AnimalType.DOG)){
            return new DogInRecovery();
        }else if (animalType.equals(AnimalType.BIRD)){
            return new BirdInRecovery();
        }else{
            return null;
        }
    }
}
