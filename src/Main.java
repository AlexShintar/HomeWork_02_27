public class Main {
    public static void main(String[] args) {

        Gryffindor[] grif = {
                new Gryffindor("Гарри Поттер", rnd100(), rnd100(), rnd100(), rnd100(), rnd100()),
                new Gryffindor("Гермиона Грейнджер", rnd100(), rnd100(), rnd100(), rnd100(), rnd100()),
                new Gryffindor("Рон Уизли", rnd100(), rnd100(), rnd100(), rnd100(), rnd100())
        };
        Hufflepuff[] huf = {
                new Hufflepuff("Захария Смит", rnd100(), rnd100(), rnd100(), rnd100(), rnd100()),
                new Hufflepuff("Седрик Диггори", rnd100(), rnd100(), rnd100(), rnd100(), rnd100()),
                new Hufflepuff("Джастин Финч-Флетчли", rnd100(), rnd100(), rnd100(), rnd100(), rnd100())
        };
        Ravenclaw[] rev = {
                new Ravenclaw("Чжоу Чанг", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100()),
                new Ravenclaw("Падма Патил", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100()),
                new Ravenclaw("Маркус Белби", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100())
        };
        Slytherin[] sly = {
                new Slytherin("Драко Малфой", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100()),
                new Slytherin("Грэхэм Монтегю", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100()),
                new Slytherin("Грегори Гойл", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100())
        };

        PrintService printService = new PrintService();
        printService.print(grif);
        printService.print(huf[0]);
        printService.print(sly[1]);
        printService.printBest(grif[1], grif[2]);
        printService.printMost(huf[0], sly[1]);
        printService.printBest(rev[0], rev[1]);
        printService.printBest(rev[2], sly[0]);
    }

    private static int rnd100() {
        return (int) (Math.random() * 100);
    }
}