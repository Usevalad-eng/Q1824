package classTasks.lessonFiveSender;

public class Vk implements Sender{

    @Override
    public void send(Message message) {
        message.setText(message.getText().toUpperCase());
        System.out.println("some text");
    }
}
