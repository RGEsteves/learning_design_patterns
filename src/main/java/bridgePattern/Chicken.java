package bridgePattern;

public class Chicken implements MoveAPI{
    @Override
    public String moveBird(int distance) {
        return "Moving Bird[bird: chicken, locomotion: walk, distance: " + distance + " km]";
    }
}
