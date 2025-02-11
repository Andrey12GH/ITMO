package model;

import interfaces.Asker;
import records.RocketInfo;

public class Neznaika extends AbstractPerson {
    private final RocketInfo rocketInfo;

    public Neznaika(String name, RocketInfo info) {
        super(name);
        this.rocketInfo = info;
        this.knowledgeLevel = 80;
    }

    public RocketInfo getRocketInfo() {
        return rocketInfo;
    }

    public void describeRocket() {
        if (!isPresent()) {
            System.out.println(getName() + " отсутствует и не может рассказать о ракете.");
            return;
        }
        speakToAudience("Я расскажу вам о ракете \"" + rocketInfo.name()
                + "\" с двигателем: " + rocketInfo.propulsionType()
                + ", которая пролетела " + rocketInfo.flightDistance() + " км!");
        increaseKnowledge(5);
    }

    public String answerQuestion(Asker asker) {
        if (getTiredness() > 90) {
            return "Извините, я слишком устал отвечать...";
        }
        increaseTiredness(10);
        return "Отвечаю: система управления ракетой устроена очень просто!";
    }
}
