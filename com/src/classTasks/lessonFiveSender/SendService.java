package classTasks.lessonFiveSender;

public class SendService {
    public void sendMessage(Message message, Sender sender){
        System.out.println(message + "" + sender);
    }
    public void getMassage(Message message,Receive receive){
        System.out.println("get from tg " + receive);

    }
}
