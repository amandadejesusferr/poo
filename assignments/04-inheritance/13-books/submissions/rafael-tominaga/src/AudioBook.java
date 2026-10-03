import java.util.Locale;

public class AudioBook extends Book {
    private double fileSizeInMB;
    private int playLengthInMinutes;
    private String narrator;

    public AudioBook(String title, int year, String author, double fileSizeInMB, int playLengthInMinutes, String narrator) {
        super(title, year, author);
        this.fileSizeInMB = fileSizeInMB;
        this.playLengthInMinutes = playLengthInMinutes;
        this.narrator = narrator;
    }

    public double getFileSizeInMB() {
        return fileSizeInMB;
    }

    public void setFileSizeInMB(double fileSizeInMB) {
        this.fileSizeInMB = fileSizeInMB;
    }

    public int getPlayLengthInMinutes() {
        return playLengthInMinutes;
    }

    public void setPlayLengthInMinutes(int playLengthInMinutes) {
        this.playLengthInMinutes = playLengthInMinutes;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s | Tamanho: %.2f MB | Duração: %d min | Narrador: %s",
                super.toString(), fileSizeInMB, playLengthInMinutes, narrator);
    }
}