package classTasks.lessonFiveWebElements;

public class CheckBox implements Click,Element{
    @Override
    public void click() {
        System.out.println("Click on checkbox");
    }
}
