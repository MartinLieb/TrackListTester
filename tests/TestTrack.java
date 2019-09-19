import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTrack {

    @Test
    void createTrack() {

        Track trackList = new Track("And You and I", 608 , false);

        assertEquals("And You and I", trackList.getTitel());

    }

    @Test
    void main() {
    }
}