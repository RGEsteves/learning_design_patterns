package prototypePattern;

public abstract class Animal implements Cloneable{
    private String id;
    protected AnimalType type;

    abstract Move move();

    public String getId() {
        return id;
    }

    public AnimalType getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
