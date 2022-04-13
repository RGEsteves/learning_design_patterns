import adapterPattern.AudioPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterPatternTest {
    AudioPlayer audioPlayer;
    @BeforeEach
    void setUp(){
        audioPlayer = new AudioPlayer();
    }

    @Test
    @DisplayName("MP3")
    void testMp3(){
        assertEquals("PlayingMp3-filename", audioPlayer.play("mp3", "filename"));
    }

    @Test
    @DisplayName("MP4")
    void testMp4(){
        assertEquals("PlayingMp4-filename", audioPlayer.play("mp4", "filename"));
    }

    @Test
    @DisplayName("VLC")
    void testVlc(){
        assertEquals("PlayingVlc-filename", audioPlayer.play("vlc", "filename"));
    }

    @Test
    @DisplayName("Invalid Media")
    void testInvalidMedia(){
        assertEquals("Invalid media", audioPlayer.play("avi", "filename"));
    }
}
