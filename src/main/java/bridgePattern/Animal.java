package bridgePattern;

public abstract class Animal {
    protected MoveAPI moveAPI;
    protected Animal(MoveAPI moveAPI){
        this.moveAPI = moveAPI;
    }
    public abstract String move();
}
