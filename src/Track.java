import java.time.Duration;

public class Track {

    private String titel;
    private Duration duration;
    private boolean bonusTrack;
    private String displayName;

    public Track(String titel, Duration duration, boolean bonusTrack, String displayName) {
        this.titel = titel;
        this.duration = duration;
        this.bonusTrack = bonusTrack;
        this.displayName = displayName;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
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

