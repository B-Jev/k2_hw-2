public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 57, 74, 39, 81, 90),
                new Gryffindor("Гермиона Грейнджер", 73, 84, 32, 46, 92),
                new Gryffindor("Рон Уизли", 56, 72, 49, 65, 24),
        };

        Puffendui[] puffenduis = {
          new Puffendui("Захария Смит",74,24,43,75,59),
          new Puffendui("Седрик Диггори",51,45,78,39,49),
          new Puffendui("Джастин Финч-Флетчли",63,48,97,75,85),
        };

        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу Чанг",75,85,74,59,76,75),
                new Kogtevran("Падма Патил",28,49,38,58,94,84),
                new Kogtevran("Маркус Белби",19,98,84,56,49,63),
        };

        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой",74,85,91,83,73,64,90),
                new Slizerin("Грэхэм Монтегю",46,57,68,74,83,87,32),
                new Slizerin("Грегори Гойл", 63,42,81,77,88,64,91),
        };
        Gryffindor.print(gryffindors);
        System.out.println();
        Slizerin.print(slizerins);
        System.out.println();
        Kogtevran.print(kogtevrans);
        System.out.println();
        Puffendui.print(puffenduis);
        System.out.println();
        System.out.println(gryffindors[1].calkulateSpecificLevel());
        System.out.println();
        gryffindors[1].compareFaculty(gryffindors[0]);
        System.out.println();
        gryffindors[1].compareFaculty(gryffindors[2]);
        System.out.println();
        puffenduis[0].compareFaculty(gryffindors[2]);
    }
}