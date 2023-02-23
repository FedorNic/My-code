package Seminar.Seminar_11.MVC_example;

public class Controller {

    public Model model = new Model();

    public void execute() {
        model.setSomeValue(100);
        model.showValue();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}
