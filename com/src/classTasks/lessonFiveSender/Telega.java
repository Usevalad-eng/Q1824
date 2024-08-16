package classTasks.lessonFiveSender;

public class Telega implements Sender, Receive{


    @Override
    public void send(Message message) {
        message.getUser().setName(message.getUser().getName() + " from tg");
        System.out.println("send from tg" + message.getText());
    }


    @Override
    public void get(Message message) {
        System.out.println("get from tg " + message.getText());
    }

}
