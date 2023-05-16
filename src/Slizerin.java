public class Slizerin extends Hogwarts {
    private int power;
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;

    public Slizerin(String student, int power, int cunning, int decisiveness, int ambition, int resourcefulness, int magic, int transgression) {
        super(student, magic, transgression);
        this.power = power;
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return super.getStudent() + " slizerin {" +
                "power=" + power +
                ", cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                "} ";
    }

    @Override
    public int calkulateSpecificLevel() {
        return this.ambition + this.cunning + this.decisiveness + this.resourcefulness + this.power;
    }

    @Override
    public void printFacultyName(String first, String second) {
        System.out.println(first + " лучший Слизеринец ,чем " + second);
    }

    public static void print(Slizerin[] slizerins) {
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println(slizerin);
        }
    }
}
