package homeTasks.homeTask3;

public class OverloadOfMethods {
     public int sum(int x, int y){
        return x + y;
    }
     public double sum(double x, double y){
        return (int)(x + y);
    }
     public int sum(int x, int y, int z){
        return x + y + z;
    }
    @Deprecated
    public int summa(int u, int o){
        System.out.println("sum"+(u+o));
        return u+o;
    }
}
