package classTasks.lessonFiveWebElements;

public class Button implements Click,Element{
    @Override
    public void click() {
        System.out.println("Click on button");
    }
}
