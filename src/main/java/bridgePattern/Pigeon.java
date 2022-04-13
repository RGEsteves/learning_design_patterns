package bridgePattern;

public class Pigeon implements MoveAPI{
    @Override
    public String moveBird(int distance) {
        return "Moving Bird[bird: pigeon, locomotion: fly, distance: " + distance + " km]";
    }
}
