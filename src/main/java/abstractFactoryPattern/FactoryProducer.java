package abstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean inRecovery){
        if (inRecovery){
            return new AnimalInRecoveryFactory();
        }else{
            return new AnimalFactory();
        }
    }
}
