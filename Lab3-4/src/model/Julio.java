package model;

public class Julio extends AbstractPerson {
    public Julio(String name) {
        super(name);
        this.knowledgeLevel = 50;
    }

    public void greetScientists() {
        if (!isPresent()) {
            System.out.println(getName() + " не присутствует и не может приветствовать учёных.");
            return;
        }
        speakToAudience("Здравствуйте, уважаемые учёные и журналисты!");
        increaseTiredness(4);
    }
}
