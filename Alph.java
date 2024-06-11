public class Alph {
    final String name;
    void show(){
        System.out.println("Объект класса Alph:");
        System.out.println("Поле name-"+name);
    }
    Alph(String name){
        this.name=name;
    }
}
final class Brav extends Alph{
    int code;
    void show(){
        System.out.println("Объект класса Bravo:");
        System.out.println("Поле name-"+name);
        System.out.println("Поле code-"+code);
    }

     Brav(String name,int code){
        super(name);
        this.code=code;
    }
}
class OverrideMethodDemo{
    public static void main(String[] args) {
        Alph objA=new Alph("objA");
        Brav objB=new Brav("objB",123);
        objA.show();
        objB.show();
    }
}