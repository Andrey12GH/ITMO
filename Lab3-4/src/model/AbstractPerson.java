package model;

import interfaces.Speaker;

public abstract class AbstractPerson implements Speaker {
    protected String name;
    protected int knowledgeLevel;
    protected int tiredness;
    protected boolean isPresent;

    public AbstractPerson(String name) {
        this.name = name;
        this.knowledgeLevel = 50;
        this.tiredness = 0;
        this.isPresent = true;
    }

    public String getName() {
        return name;
    }

    public void setPresent(boolean present) {
        this.isPresent = present;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public void increaseKnowledge(int amount) {
        knowledgeLevel += amount;
        if (knowledgeLevel > 100) knowledgeLevel = 100;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void increaseTiredness(int amount) {
        tiredness += amount;
        if (tiredness > 100) tiredness = 100;
    }

    @Override
    public void speakToAudience(String message) {
        System.out.println(name + " говорит собравшимся: \"" + message + "\"");
        increaseTiredness(5);
    }

    @Override
    public void speakToPerson(Speaker other, String message) {
        System.out.println(name + " обращается к " + ((AbstractPerson)other).getName() + ": \"" + message + "\"");
        increaseTiredness(2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AbstractPerson other)) return false;
        return name.equals(other.name)
                && knowledgeLevel == other.knowledgeLevel
                && tiredness == other.tiredness
                && isPresent == other.isPresent;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + knowledgeLevel;
        result = 31 * result + tiredness;
        result = 31 * result + Boolean.hashCode(isPresent);
        return result;
    }

    @Override
    public String toString() {
        return "AbstractPerson{name='" + name + "', knowledge="
                + knowledgeLevel + ", tiredness=" + tiredness
                + ", present=" + isPresent + "}";
    }
}
