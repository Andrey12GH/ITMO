package interfaces;

public interface Place {
    String getName();
    int capacity();
    boolean canAccommodate(int numberOfPeople);
}
