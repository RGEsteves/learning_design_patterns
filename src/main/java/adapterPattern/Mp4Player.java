package adapterPattern;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public String playVlc(String fileName) {
        return "Invalid media";
    }

    @Override
    public String playMp4(String fileName) {
        return "PlayingMp4-" + fileName;
    }
}
