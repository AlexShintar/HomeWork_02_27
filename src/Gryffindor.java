public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int courage) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String getFaculty() {
        return "Гриффиндорец";
    }

    @Override
    public int getNature() {
        return nobility + honor + courage;
    }
}
