package model;

public class Kozlik extends AbstractPerson {
    public Kozlik(String name) {
        super(name);
        this.knowledgeLevel = 40;
    }

    public void addRemark() {
        if (!isPresent()) {
            System.out.println(getName() + " не может ничего добавить, отсутствует.");
            return;
        }
        speakToAudience("Козлик поддакивает, подтверждая сказанное!");
        increaseTiredness(2);
    }
}
