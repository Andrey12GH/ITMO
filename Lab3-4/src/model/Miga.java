package model;

public class Miga extends AbstractPerson {
    public Miga(String name) {
        super(name);
        this.knowledgeLevel = 30;
    }

    public void commentOnNeznaika() {
        if (!isPresent()) {
            System.out.println(getName() + " не может комментировать, т.к. отсутствует.");
            return;
        }
        speakToAudience("Я поддерживаю Незнайку, он здорово всё объясняет!");
        increaseTiredness(3);
    }
}
