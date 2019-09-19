import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TestTrack {

    @Test
    void createTrack() {

        Track trackList = new Track("And You and I", Duration.ofMinutes(10).plusSeconds(8), false, "[PT10M8S]");

        assertEquals("And You and I", trackList.getTitel());
        assertEquals(Duration.ofMinutes(10).plusSeconds(8), trackList.getDuration());
        assertFalse(trackList.isBonusTrack());
        assertEquals("[PT10M8S]", trackList.getDisplayName());


    }
    @Test
    void createTrack2() {

        Track trackList = new Track("America",Duration.ofMinutes(4).plusSeconds(12), true, "[PT4M12S]");

        assertEquals("America", trackList.getTitel());
        assertEquals(Duration.ofMinutes(4).plusSeconds(12), trackList.getDuration());
        assertTrue(trackList.isBonusTrack());
        assertEquals("[PT4M12S]", trackList.getDisplayName());


    }

    @Test
    void main() {
    }
}