public abstract class Hogwarts {
    private String student;
    private int magic;
    private int transgression;

    public Hogwarts(String student, int magic, int transgression) {
        this.student = student;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "hogwarts{" +
                "student='" + student + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }

    public abstract int calkulateSpecificLevel();
    public abstract void printFacultyName(String first, String second);

    public int calculateLevel() {
        return this.magic + this.transgression;
    }

    public void compareFaculty(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareSpecificLevel(hogwarts);
        } else {
            compareLevel(hogwarts);
        }
    }

    private void compareLevel(Hogwarts hogwarts) {
        int thisLevel = this.calculateLevel();
        int overLevel = hogwarts.calculateLevel();
        if (thisLevel > overLevel) {
            System.out.println(this.getStudent() + " сильнее чем " + hogwarts.getStudent());
        } else if (thisLevel < overLevel) {
            System.out.println(hogwarts.getStudent() + " сильнее чем " + this.getStudent());
        } else {
            System.out.println(this.getStudent() + " ученики одинаковы по силе " + hogwarts.getStudent());
        }

    }

    private void compareSpecificLevel(Hogwarts hogwarts) {
        int thisLevel = this.calculateLevel() + this.calkulateSpecificLevel();
        int overLevel = hogwarts.calculateLevel() + hogwarts.calkulateSpecificLevel();
        if (thisLevel > overLevel) {
            printFacultyName(this.getStudent(), hogwarts.getStudent());
        } else if (thisLevel < overLevel) {
            printFacultyName(hogwarts.getStudent(), this.getStudent());
        } else {
            System.out.println(this.getStudent() + " ученики одинаковы по силе " + hogwarts.getStudent());
        }

    }

}

