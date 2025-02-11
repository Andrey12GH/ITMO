import exceptions.NoOneToAnswerException;
import exceptions.TooManyQuestionsException;
import model.*;
import records.RocketInfo;

public class MainRunner {
    public static void main(String[] args) {
        LargeConferenceHall hall = new LargeConferenceHall("Большой зал телестудии", 20);
        Rocket rocket = new Rocket(new RocketInfo("Лунный корабль", "Химический", 384000));
        CosmicConferenceScenario scenario = new CosmicConferenceScenario(hall, rocket);

        scenario.addAsker(new Scientist("Профессор Пи", "Математика"));
        scenario.addAsker(new Scientist("Доктор Икс", "Физика"));
        scenario.addAsker(new Scientist("Профессор Аргон", "Химия"));
        scenario.addAsker(new Scientist("Д-р Поллукс", "Астрономия"));
        scenario.addAsker(new Scientist("Инженер Гель", "Лунология"));
        scenario.addAsker(new Journalist("Мисс Буква", "Газета 'Звездочка'"));
        scenario.addAsker(new Journalist("Мистер Шарик", "Журнал 'Космос'"));

        try {
            scenario.initConference();
        } catch (NoOneToAnswerException e) {
            System.out.println(e.getMessage());
            System.out.println("Программа завершается, поскольку никто не может рассказать о ракете.");
            return;
        }

        scenario.startPresentation();

        try {
            scenario.runQuestionsAndAnswers();
        } catch (TooManyQuestionsException e) {
            System.out.println(e.getMessage());
            System.out.println("Видимо, нужна пауза на рекламу...");
        }

        scenario.finishConference();
    }
}
