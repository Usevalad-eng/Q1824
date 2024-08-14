package classTasks.lessonFiveSender;

public class Message {
    private String text;
    private User user;

    public Message(String text, User user) {
        this.text = text;
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public User getUser() {
        return user;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", user=" + user +
                '}';
    }

}
