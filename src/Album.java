import java.time.Duration;
import java.time.LocalDate;

public class Album extends Track{

    private String albumTitle;
    private LocalDate localDate;
    private Duration duration;
    private String type;
    private int trackCount;

    public Album(String albumTitle, LocalDate localDate, int trackCount, String type, this.Track) {
        super(this.getTitle(),this.getDuration(),this.isBonusTrack(),this.getDisplayName());
        this.albumTitle = albumTitle;
        this.localDate = localDate;
        this.trackCount = trackCount;
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

    public void setType(String type) {
        this.type = type;
    }


    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }
}
