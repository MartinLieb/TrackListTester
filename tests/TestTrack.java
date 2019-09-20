import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestTrack {

    @Test
    void createTrack() {

        Track track = new Track("And You and I", Duration.ofMinutes(10).plusSeconds(8), false, "And You and I [PT10M8S]");

        assertEquals("And You and I", track.getTitle());
        assertEquals(Duration.ofMinutes(10).plusSeconds(8), track.getDuration());
        assertFalse(track.isBonusTrack());
        assertEquals("And You and I [PT10M8S]", track.getDisplayName());


    }
    @Test
    void createTrack2() {

        Track track = new Track("America",Duration.ofMinutes(4).plusSeconds(12), true, "America [PT4M12S]");

        assertEquals("America", track.getTitle());
        assertEquals(Duration.ofMinutes(4).plusSeconds(12), track.getDuration());
        assertTrue(track.isBonusTrack());
        assertEquals("America [PT4M12S]", track.getDisplayName());


    }

    @Test
    void testCreateEmptyAlbum() {

        Album album = new Album("Under Production", LocalDate.of(2074,10,6),  "single");

        assertEquals("Under Production", album.getAlbumTitle());
        assertEquals(LocalDate.of(2074,10,6), album.getLocalDate());
        assertEquals(0, album.getTrackCount());
        assertEquals("single", album.getType());
        assertEquals("Under Production [2074-10-06, PT0S]", album.toString());

    }

    @Test
    void testCreateAlbum() {

        Album album = new Album
                ("Close to the Edge", LocalDate.of(1972,9,13),  "album");
        album.addTrack(new Track("And You and I", Duration.ofMinutes(10).plusSeconds(8), false, "And You and I [PT10M8S]"));
        album.addTrack(new Track("America",Duration.ofMinutes(4).plusSeconds(12), true, "America [PT4M12S]"));

        assertEquals("Close to the Edge", album.getAlbumTitle());
        assertEquals(LocalDate.of(1972,9,13), album.getLocalDate());
        assertEquals(2, album.getTrackCount());
        assertEquals("album", album.getType());
        assertEquals(Duration.ofMinutes(14).plusSeconds(20),album.getPlaytime());
        assertEquals("Close to the Edge [1972-09-13, PT14M20S]\\n[1] And You and I [PT10M8S]\\n[2] America [PT4M12S]", album.toString());


    }

    @Test
    void testCreatEmptyDiscography(){

        //Discography discography = new Discography(artist:"Future Artist", albumCount: 2, displayName: "Future Artist\\n0 records");

        //assertEquals("Future Artist", discography.getArtist());
        //assertEquals(2, discography.getAlbumCount());
        //assertEquals("Future Artist\\n0 records", discography.getDisplayName());

    }



        @Test
    void main() {
    }
}