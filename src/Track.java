public class Track {

    private String titel;
    private int durationSeconds;
    private boolean bonusTrack;

    public Track(String titel, int durationSeconds, boolean bonusTrack) {
        this.titel = titel;
        this.durationSeconds = durationSeconds;
        this.bonusTrack = bonusTrack;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public boolean isBonusTrack() {
        return bonusTrack;
    }

    public void setBonusTrack(boolean bonusTrack) {
        this.bonusTrack = bonusTrack;
    }



}
