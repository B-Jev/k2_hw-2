public class puffendui extends hogwarts {
    private int diligence;
    private int faithful;
    private int honest;

    public puffendui(String student, int diligence, int faithful, int honest, int transgression, int magic) {
        super(student, transgression, magic);
        this.diligence = diligence;
        this.faithful = faithful;
        this.honest = honest;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        this.faithful = faithful;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.getStudent() + " puffendui {" +
                "diligence=" + diligence +
                ", faithful=" + faithful +
                ", honest=" + honest +
                "} ";
    }

    @Override
    public int calkulateSpecificLevel() {
        return this.diligence + this.faithful + this.honest;
    }

    public static void print(puffendui[] puffenduis) {
        for (int i = 0; i < puffenduis.length; i++) {
            puffendui puffendui = puffenduis[i];
            System.out.println(puffendui);
        }
    }
}
