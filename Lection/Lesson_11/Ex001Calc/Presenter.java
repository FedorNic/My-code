package Lection.Lesson_11.Ex001Calc;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
