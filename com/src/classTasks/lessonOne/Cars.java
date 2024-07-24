package classTasks.lessonOne;

public class Cars {
    public  void cars() {
        String a = "green";
        String b = "blue";
        String c = "yellow";
        String d = "red";
        String k = "red";

        if (k.equals(b) || k.equals(a)) {
            System.out.println("box A");

        }
        else if (k.equals(c) || k.equals(d)) {

            System.out.println("box B");
        }
        else {
            System.out.println("box C");
        }
    }
}
