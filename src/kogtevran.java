public class kogtevran extends hogwarts {
    private int smart;
    private int creative;
    private int witty;
    private int wise;

    public kogtevran(String student, int smart, int creative, int witty, int wise, int magic, int transgression) {
        super(student, magic, transgression);
        this.smart = smart;
        this.creative = creative;
        this.witty = witty;
        this.wise = wise;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    @Override
    public String toString() {
        return super.getStudent() + " kogtevran {" +
                "smart=" + smart +
                ", creative=" + creative +
                ", witty=" + witty +
                ", wise=" + wise +
                "} ";
    }

    @Override
    public int calkulateSpecificLevel() {
        return this.creative + this.smart + this.wise + this.witty;
    }

    public static void print(kogtevran[] kogtevrans) {
        for (int i = 0; i < kogtevrans.length; i++) {
            kogtevran kogtevran = kogtevrans[i];
            System.out.println(kogtevran);
        }
    }
}
