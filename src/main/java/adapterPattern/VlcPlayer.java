package adapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public String playVlc(String fileName) {
        return "PlayingVlc-" + fileName;
    }

    @Override
    public String playMp4(String fileName) {
        return "Invalid media";
    }
}
