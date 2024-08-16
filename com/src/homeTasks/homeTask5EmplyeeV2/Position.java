package homeTasks.homeTask5EmplyeeV2;

public enum Position {
    DIRECTOR(2.5),
    TEAM_LEAD(1.8),
    SENIOR_DEVELOPER(1.5),
    JUNIOR_DEVELOPER(1.1),
    QA_ENGINEER(1.15);

    protected double coef;

    Position(double coef) {
        this.coef = coef;
    }

    public double getCoef() {
        return coef;
    }
}
