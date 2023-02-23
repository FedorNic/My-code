package SandBox.Cup;

public abstract class Cup {

    protected int weight;
    protected int value;
    protected int handle;
//    protected int yutu;
    protected String color;
    protected boolean isTermo;

    {
        weight = 500;
        color = "White";
    }

    public Cup(int value, int handle, int weight, String color, boolean isTermo) {
        this.value = value;
        this.handle = handle;
        this.weight = weight;
        this.color = color;
        this.isTermo = isTermo;
    }

//    public Cup(int weight, String color) {
//        this(78);
//        this.weight = weight;
//        this.color = color;
//    }

    public Cup() {
    }

    public Cup(int i) {

    }

    public abstract void sound();

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void sound(String sound);
}
