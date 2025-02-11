package model;

import interfaces.Place;

public class LargeConferenceHall implements Place {
    private final String name;
    private final int maxCapacity;

    public LargeConferenceHall(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int capacity() {
        return maxCapacity;
    }

    @Override
    public boolean canAccommodate(int numberOfPeople) {
        return numberOfPeople <= maxCapacity;
    }

    @Override
    public String toString() {
        return "LargeConferenceHall{" + "name='" + name + "', maxCapacity=" + maxCapacity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LargeConferenceHall other)) return false;
        return this.name.equals(other.name) && this.maxCapacity == other.maxCapacity;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + maxCapacity;
        return result;
    }
}
