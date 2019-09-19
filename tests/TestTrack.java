import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTrack {

    @Test
    void createTrack() {

        Track trackList = new Track("And You and I", 608 , false, "[PT10M8S]");

        assertEquals("And You and I", trackList.getTitel());
        assertEquals(608, trackList.getDurationSeconds());
        assertFalse(trackList.isBonusTrack());
        assertEquals("[PT10M8S]", trackList.getDisplayName());


    }

    @Test
    void main() {
    }
}