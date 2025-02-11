package model;

import interfaces.Asker;

public class Journalist extends AbstractPerson implements Asker {
    private final String publication;

    public Journalist(String name, String publication) {
        super(name);
        this.publication = publication;
        this.knowledgeLevel = 60;
    }

    @Override
    public String askQuestion() {
        increaseTiredness(2);
        return "Скажите, что планируется дальше? Какая будет следующая экспедиция?";
    }

    @Override
    public void receiveAnswer(String answer) {
        System.out.println(getName() + " (издание: " + publication + ") записывает ответ: " + answer);
        increaseKnowledge(3);
    }
}
