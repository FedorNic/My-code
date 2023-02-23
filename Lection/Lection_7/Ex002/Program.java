package Lection.Lection_7.Ex002;

public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D first = new Point2D();
        first.x = 0;
        first.y = 2;
        System.out.println(first.toString());

        Point2D second = new Point2D();
        second.x = 0;
        second.y = 10;
        System.out.println(second.toString());
        System.out.println(distance(first, second));
        
    }
}
