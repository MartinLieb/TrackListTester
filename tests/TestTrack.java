import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestTrack {

    @Test
    void createTrack() {

        Track track = new Track("And You and I", Duration.ofMinutes(10).plusSeconds(8), false, "[PT10M8S]");

        assertEquals("And You and I", track.getTitle());
        assertEquals(Duration.ofMinutes(10).plusSeconds(8), track.getDuration());
        assertFalse(track.isBonusTrack());
        assertEquals("[PT10M8S]", track.getDisplayName());


    }
    @Test
    void createTrack2() {

        Track track = new Track("America",Duration.ofMinutes(4).plusSeconds(12), true, "[PT4M12S]");

        assertEquals("America", track.getTitle());
        assertEquals(Duration.ofMinutes(4).plusSeconds(12), track.getDuration());
        assertTrue(track.isBonusTrack());
        assertEquals("[PT4M12S]", track.getDisplayName());


    }

    @Test
    void createTrack3() {

        Album album = new Album("Under Production", LocalDate.of(2074,10,6), 0, "single");

        assertEquals("Under Production", album.getAlbumTitle());
        assertEquals(LocalDate.of(2074,10,6), album.getLocalDate());
        assertEquals(0, album.getTrackCount());
        assertEquals("single", album.getType());

    }

    @Test
    void createTrack4() {

        Album album = new Album("Close to the Edge", LocalDate.of(1972,9,13), 2, "album");

        assertEquals("Close to the Edge", album.getAlbumTitle());
        assertEquals(LocalDate.of(1972,9,13), album.getLocalDate());
        assertEquals(2, album.getTrackCount());
        assertEquals("album", album.getType());

    }



        @Test
    void main() {
    }
}