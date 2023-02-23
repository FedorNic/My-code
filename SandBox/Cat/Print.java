package SandBox.Cat;

public class Print {

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 5, 4);
        barsik.setName("Leopold");
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        Cat pushok = new Cat("Пушок", 3, 4);
        Cat jgjf = new Cat();



        System.out.println("Имя кота: " + jgjf.getName());
        System.out.println("Возраст кота: " + jgjf.getAge());
        System.out.println("Вес кота: " + jgjf.getWeight());
        System.out.println("Замена имени:  ");
    }
}
