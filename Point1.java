public class Point1 { int x;
    int y;
    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 class PointDemo {
    void resetPoint1(Point1 p) {
        p = new Point1(0, 0);
    }
    void resetPoint2(Point1 p) {
        p.x = 0;
        p.y = 0;
    }
    public static void main(String[] args) {
        Point1 p1 = new Point1(3, 5);
        Point1 p2 = new Point1(10, 15);
        PointDemo demo = new PointDemo();
        demo.resetPoint1(p1);
        System.out.println("(" + p1.x + ", " + p1.y + ")"); // Question (i)

        demo.resetPoint2(p2);
        System.out.println("(" + p2.x + ", " + p2.y + ")"); // Question (i)
        p2 = new Point1(9, 9); // Question (ii)
    }
}

