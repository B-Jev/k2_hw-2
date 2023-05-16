public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String student, int nobility, int honor, int courage, int transgression, int magic) {
        super(student, transgression, magic);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public static void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor);
        }
    }

    @Override
    public String toString() {
        return super.getStudent() + " gryffindor {" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                "} ";
    }

    @Override
    public int calkulateSpecificLevel() {
        return this.courage + this.honor + this.nobility;
    }

    @Override
    public void printFacultyName(String first, String second) {
        System.out.println(first + " лучший Гриффендорец ,чем " + second);
    }
}
