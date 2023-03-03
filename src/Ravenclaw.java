public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wits;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgression, int intellect, int wisdom, int wits, int creativity) {
        super(name, magic, transgression);
        this.wits = wits;
        this.wisdom = wisdom;
        this.intellect = intellect;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWits() {
        return wits;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String getFaculty() {
        return "Когтевранец";
    }

    @Override
    public int getNature() {
        return wits + wisdom + intellect + creativity;
    }
}
