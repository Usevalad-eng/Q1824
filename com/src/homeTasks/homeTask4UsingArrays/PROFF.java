package homeTasks.homeTask4UsingArrays;

public enum PROFF {
    WORKER(1),
    DIRECTOR(2);
    int coef;

    PROFF(int coef) {
        this.coef = coef;
    }

    public int getCoef() {
        return coef;
    }
}
