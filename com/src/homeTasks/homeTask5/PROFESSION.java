package homeTasks.homeTask5;

public enum PROFESSION {
    WORKER(1),
    DIRECTOR(6),
    TEAM_LEAD(5),
    SENIOR_DEVELOPER(4),
    JUNIOR_DEVELOPER(3),
    QA_ENGINEER(2);


    int coef;

    PROFESSION(int coef) {
        this.coef = coef;
    }

    public int getCoef() {
        return coef;
    }
}
