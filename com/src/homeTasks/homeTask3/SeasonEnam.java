package homeTasks.homeTask3;

public class SeasonEnam {
    private Type seasonType;

    public SeasonEnam(Type seasonType) {
        this.seasonType = seasonType;
    }

    public void getType(){
        switch (seasonType){
            case DESEMBER:
                System.out.println("winter");
                break;
            case JANUARY:
                System.out.println("winter");
                break;
            case FEBRUARY:
                System.out.println("winter");
                break;
            case MARCH:
                System.out.println("spring");
                break;
            case APRIL:
                System.out.println("spring");
                break;
            case MAY:
                System.out.println("spring");
                break;
            case JUNE:
                System.out.println("summer");
                break;
            case JULY:
                System.out.println("summer");
                break;
            case AUGUST:
                System.out.println("summer");
                break;
            case SEPTEMBER:
                System.out.println("fall");
                break;
            case OKTOBER:
                System.out.println("fall");
                break;
            case NOVEMBER:
                System.out.println("fall");
                break;
            default:
                System.out.println("error");
        }

    }
    public enum Type{
        DESEMBER,
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OKTOBER,
        NOVEMBER;
    }
}
