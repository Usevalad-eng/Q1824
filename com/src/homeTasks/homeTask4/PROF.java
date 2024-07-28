package homeTasks.homeTask4;

public enum PROF {
    WORKER(1),
    DIRECTOR(2);
    private int coef;

    PROF(int coef) {
        this.coef = coef;
    }

    public int getCoef() {
        return coef;
    }
}
