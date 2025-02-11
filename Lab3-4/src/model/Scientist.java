package model;

import interfaces.Asker;

public class Scientist extends AbstractPerson implements Asker {
    private final String specialization;

    public Scientist(String name, String specialization) {
        super(name);
        this.specialization = specialization;
        this.knowledgeLevel = 70;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String askQuestion() {
        increaseTiredness(3);
        return "Как именно устроена ваша ракета? Уточните детали для специальности: " + specialization;
    }

    @Override
    public void receiveAnswer(String answer) {
        if (answer == null || answer.isEmpty()) {
            System.out.println(getName() + " не получил ответа!");
            return;
        }
        System.out.println(getName() + " (специализация: " + specialization + ") слушает ответ: " + answer);
        increaseKnowledge(5);
    }
}
