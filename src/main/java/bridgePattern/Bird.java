package bridgePattern;

public class Bird extends Animal{
    private int distanceToGo;

    public Bird(int distanceToGo, MoveAPI moveAPI) {
        super(moveAPI);
        this.distanceToGo = distanceToGo;
    }

    @Override
    public String move() {
        return moveAPI.moveBird(distanceToGo);
    }
}
