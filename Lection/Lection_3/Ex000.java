package Lection.Lection_3;

public class Ex000 {
    public static void main(String[] args) {
        Object o = 1;
        getType(o);
        o = "1.2";
        getType(o);
    }

    public static void getType(Object ob) {
        System.out.println(ob.getClass().getSimpleName());
    }
}
