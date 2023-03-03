public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int desire;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resource, int desire) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.desire = desire;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResource() {
        return resource;
    }

    public int getDesire() {
        return desire;
    }

    @Override
    public String getFaculty() {
        return "Слизеринец";
    }

    @Override
    public int getNature() {
        return cunning + determination + ambition + resource + desire;
    }
}
