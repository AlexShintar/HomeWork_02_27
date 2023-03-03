public class PrintService {
    public void print(Gryffindor[] gryffindor) {
        for (Gryffindor student : gryffindor) {
            print(student);
        }
    }

    public void print(Hufflepuff[] hufflepuff) {
        for (Hufflepuff student : hufflepuff) {
            print(student);
        }
    }

    public void print(Ravenclaw[] ravenclaw) {
        for (Ravenclaw student : ravenclaw) {
            print(student);
        }
    }

    public void print(Slytherin[] slytherin) {
        for (Slytherin student : slytherin) {
            print(student);
        }
    }

    public void print(Gryffindor student) {
        printBase(student);
        System.out.println("Благородство: " + student.getNobility() + ", Честь: " + student.getHonor() + ", Храбрость: " + student.getCourage() + ".\n");
    }

    public void print(Hufflepuff student) {
        printBase(student);
        System.out.println("Трудолюбие: " + student.getDiligence() + ", Верность: " + student.getLoyalty() + ", Честность: " + student.getHonesty() + ".\n");
    }

    public void print(Ravenclaw student) {
        printBase(student);
        System.out.println("Ум: " + student.getIntellect() + ", Мудрость: " + student.getWisdom() + ", Остроумие : " + student.getWits() + ", Творчество : " + student.getCreativity() + ".\n");
    }


    public void print(Slytherin student) {
        printBase(student);
        System.out.println("Хитрость: " + student.getCunning() + ", Решительность: " + student.getDetermination() + ", Амбициозность: " + student.getAmbition() + ", Находчивость : " + student.getResource() + ", Жажда власти. : " + student.getDesire() + ".\n");
    }

    private void printBase(Hogwarts student) {
        System.out.println("Студент: " + student.getName() + "\nМагия: " + student.getMagic() + ", Трансгресия: " + student.getTransgression());
    }

    public void printBest(Hogwarts student1, Hogwarts student2) {
        if (!student1.getFaculty().equals(student2.getFaculty())) {
            System.out.println("Сравнение характера учеников разных факкультетов некорректно");
            return;
        }
        if (student1.getNature() > student2.getNature())
            System.out.println(student1.getName().split(" ")[0] + " лучший " + student1.getFaculty() + " чем " + student2.getName().split(" ")[0]);
        else if (student1.getNature() < student2.getNature())
            System.out.println(student2.getName().split(" ")[0] + " лучший " + student1.getFaculty() + " чем " + student1.getName().split(" ")[0]);
        else System.out.println("Ученики равны");
        System.out.println();
    }

    public void printMost(Hogwarts student1, Hogwarts student2) {
        if (student1.getPower() > student2.getPower())
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName());
        else if (student1.getPower() < student2.getPower())
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName());
        else System.out.println("Ученики равны");
        System.out.println();
    }
}
