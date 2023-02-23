package SandBox.Cup;

public class CoffeCup extends Cup {

    public static int count;

    static {
        count = 0;
    }

    public CoffeCup(int value, int handle, int weight, String color, boolean isTermo) {
        super(value, handle, weight, color, isTermo);
        this.color = "Yellow";
        count++;
    }



//    public CoffeCup() {
//        this(value: 6578, handle, weight, color, isTermo);
//        count++;
//    }

    @Override
    public void sound() {
        System.out.println("Бдзынь");
    }

    @Override
    public void sound(String bell) {
        System.out.println(bell);
    }
}
