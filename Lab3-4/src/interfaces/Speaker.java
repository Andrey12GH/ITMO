package interfaces;

public interface Speaker {
    void speakToAudience(String message);
    void speakToPerson(Speaker other, String message);
}
