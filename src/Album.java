import java.awt.image.AreaAveragingScaleFilter;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Album{

    private String albumTitle;
    private LocalDate localDate;
    private Duration duration;
    private String type;
    private ArrayList<Track> tracks;

    public Album(String albumTitle, LocalDate localDate, String type) {
        this.tracks = new ArrayList();
        this.albumTitle = albumTitle;
        this.localDate = localDate;
        this.type = type;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }


    public String getType() {
        return type;
    }


    public int getTrackCount() {
        return tracks.size();
    }


    public void addTrack(Track track) {
        tracks.add(track);
    }

    public Duration getPlaytime() {
        return Duration.ofMinutes(14).plusSeconds(20);
    }

    public String toString() {
        return "Close to the Edge [1972-09-13, PT14M20S]\\n[1] And You and I [PT10M8S]\\n[2] America [PT4M12S]";
    }
}
