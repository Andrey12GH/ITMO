package model;

import exceptions.NoOneToAnswerException;
import exceptions.TooManyQuestionsException;
import interfaces.Asker;
import java.util.ArrayList;
import java.util.List;

public class CosmicConferenceScenario {
    private final LargeConferenceHall hall;
    private final Neznaika neznaika;
    private final Miga miga;
    private final Kozlik kozlik;
    private final Julio julio;
    private final List<Asker> askers;
    private final Rocket rocket;

    public CosmicConferenceScenario(LargeConferenceHall hall, Rocket rocket) {
        this.hall = hall;
        this.rocket = rocket;

        this.neznaika = new Neznaika("Незнайка", rocket.getInfo());
        this.miga = new Miga("Мига");
        this.kozlik = new Kozlik("Козлик");
        this.julio = new Julio("Жулио");

        askers = new ArrayList<>();
    }

    public void addAsker(Asker a) {
        askers.add(a);
    }

    public void initConference() throws NoOneToAnswerException {
        int totalPeople = 4 + askers.size();
        if (!hall.canAccommodate(totalPeople)) {
            System.out.println("В зале недостаточно мест! Нельзя начать конференцию.");
            return;
        }
        if (!(neznaika.isPresent() || miga.isPresent() || kozlik.isPresent() || julio.isPresent())) {
            throw new NoOneToAnswerException("Все ключевые персонажи отсутствуют, некому рассказывать!");
        }
        System.out.println("Конференция начинается в зале: " + hall.getName());
        System.out.println("Участников всего: " + totalPeople);
    }

    public void startPresentation() {
        System.out.println("На возвышении сидят: " + neznaika.getName()
                + ", " + miga.getName() + ", " + kozlik.getName()
                + ", " + julio.getName());

        julio.greetScientists();
        miga.commentOnNeznaika();
        kozlik.addRemark();
        neznaika.describeRocket();
    }

    public void runQuestionsAndAnswers() {
        int questionsAsked = 0;
        for (Asker a : askers) {
            if (questionsAsked > 10) {
                throw new TooManyQuestionsException("Слишком много вопросов подряд!");
            }
            if (a instanceof AbstractPerson person && !person.isPresent()) {
                System.out.println(person.getName() + " отсутствует, пропускаем.");
                continue;
            }
            String question = a.askQuestion();
            System.out.println("Вопрос: " + question);
            String answer = neznaika.answerQuestion(a);
            a.receiveAnswer(answer);
            questionsAsked++;
        }
    }

    public void finishConference() {
        System.out.println("Конференция подошла к концу. Все участники устали, но довольны.");
        if (!rocket.isFunctional()) {
            System.out.println("К сожалению, ракета больше не на ходу...");
        } else {
            System.out.println("Ракета по-прежнему исправна и готова к новым путешествиям!");
        }
    }
}
