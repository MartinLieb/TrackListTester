import java.awt.image.AreaAveragingScaleFilter;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Album{

    private String albumTitle;
    private LocalDate releaseDate;
    private Duration duration;
    private String type;
    private ArrayList<Track> tracks;

    public Album(String albumTitle, LocalDate localDate, String type) {
        this.tracks = new ArrayList();
        this.albumTitle = albumTitle;
        this.releaseDate = localDate;
        this.type = type;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public LocalDate getLocalDate() {
        return releaseDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.releaseDate = localDate;
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
        Duration playtime = Duration.ofSeconds(0);
        for (int i = 0; i < tracks.size(); i++) {
            playtime = playtime.plus(tracks.get(i).getDuration());

        }
        return playtime;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(albumTitle + " [" + releaseDate + ", " + getPlaytime().toString() + "]");
        for (int i = 0; i < tracks.size(); i++) {
            stringBuilder.append("\\n" + "["+ (i+1) +"] " + tracks.get(i).toString());
        }
        return stringBuilder.toString();

    }
}
