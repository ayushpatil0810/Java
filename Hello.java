class Point {
    int x;
    int y;
}

public class Hello {
    public static void main(String args[]) {
        Point p1 = new Point();

        p1.x = 1;
        p1.y = 2;

        System.out.println(p1.x + " " + p1.y);

        Point p2 = p1;

        p2.y = 30;

        System.out.println(p2.x + " " + p2.y);
    } 
}
