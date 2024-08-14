package classTasks.lessonFiveSender;

public class Insta implements Sender{
    @Override
    public void send(Message message) {
        System.out.println("text from insta");
    }
}
