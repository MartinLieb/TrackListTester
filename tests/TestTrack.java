import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestTrack {

    @Test
    void createTrack() {

        Track trackList = new Track("And You and I", Duration.ofMinutes(10).plusSeconds(8), false, "[PT10M8S]");

        assertEquals("And You and I", trackList.getTitle());
        assertEquals(Duration.ofMinutes(10).plusSeconds(8), trackList.getDuration());
        assertFalse(trackList.isBonusTrack());
        assertEquals("[PT10M8S]", trackList.getDisplayName());


    }
    @Test
    void createTrack2() {

        Track trackList = new Track("America",Duration.ofMinutes(4).plusSeconds(12), true, "[PT4M12S]");

        assertEquals("America", trackList.getTitle());
        assertEquals(Duration.ofMinutes(4).plusSeconds(12), trackList.getDuration());
        assertTrue(trackList.isBonusTrack());
        assertEquals("[PT4M12S]", trackList.getDisplayName());


    }

    @Test
    void createTrack3() {

        Album album = new Album("Under Production", LocalDate.of(2074,10,6), );

        assertEquals("Under Production", trackList.getAlbumTitle);
        assertEquals(LocalDate.of(2074,10,6), trackList.getDate());
        assertEquals(Duration.ofMinutes(0).plusSeconds(0), trackList.getDuration());
        assertEquals(0, trackList.getTrackCount);
        assertEquals("single", trackList.getType);

    }

        @Test
    void main() {
    }
}