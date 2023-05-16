public class Main {
    public static void main(String[] args) {
        gryffindor[] gryffindors = {
                new gryffindor("Гарри Поттер", 57, 74, 39, 81, 90),
                new gryffindor("Гермиона Грейнджер", 73, 84, 32, 46, 92),
                new gryffindor("Рон Уизли", 56, 72, 49, 65, 24),
        };

        puffendui[] puffenduis = {
          new puffendui("Захария Смит",74,24,43,75,59),
          new puffendui("Седрик Диггори",51,45,78,39,49),
          new puffendui("Джастин Финч-Флетчли",63,48,97,75,85),
        };

        kogtevran [] kogtevrans = {
                new kogtevran("Чжоу Чанг",75,85,74,59,76,75),
                new kogtevran("Падма Патил",28,49,38,58,94,84),
                new kogtevran("Маркус Белби",19,98,84,56,49,63),
        };

        slizerin [] slizerins = {
                new slizerin("Драко Малфой",74,85,91,83,73,64,90),
                new slizerin("Грэхэм Монтегю",46,57,68,74,83,87,32),
                new slizerin("Грегори Гойл", 63,42,81,77,88,64,91),
        };
        gryffindor.print(gryffindors);
        System.out.println();
        slizerin.print(slizerins);
        System.out.println();
        kogtevran.print(kogtevrans);
        System.out.println();
        puffendui.print(puffenduis);
        System.out.println();
        System.out.println(gryffindors[1].calkulateSpecificLevel());
        System.out.println();
        gryffindors[1].compareLevel(gryffindors[0]);
        System.out.println();
        gryffindors[1].compareSpecificLevel(gryffindors[2]);
        System.out.println();
        puffenduis[0].compareLevel(gryffindors[2]);
    }
}