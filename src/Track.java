import java.time.Duration;

public class Track {

    private String title;
    private Duration duration;
    private boolean bonusTrack;
    private String displayName;

    public Track(String title, Duration duration, boolean bonusTrack, String displayName) {
        this.title = title;
        this.duration = duration;
        this.bonusTrack = bonusTrack;
        this.displayName = displayName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public boolean isBonusTrack() {
        return bonusTrack;
    }

    public void setBonusTrack(boolean bonusTrack) {
        this.bonusTrack = bonusTrack;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}

