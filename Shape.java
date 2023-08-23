public abstract class Shape {
    public abstract void printArea();

}
class Rectangle extends Shape {
            double width, height;

            public Rectangle(double width, double
                    height) {
                this.width = width;
                this.height = height;
            }

            public void printArea() {
                double area = width * height;
                System.out.println("Area: " + area);
            }
        }
class Square extends Shape {
    double side;
    public Square(double side) {
        this.side = side; }
public void printArea(){
        double area=side*side;
        System.out.println("area" +area);
        }

            public static void main(String[] args) {
              Shape sh1, sh2;
                Rectangle r1;
                Square s1;
                sh1 = new Square(10);
                sh2 = new Rectangle(10, 20);
                s1 = new Square(5);
                r1 = new Rectangle(5, 10);
                r1.printArea();
                s1.printArea();
                sh1.printArea();
                sh2.printArea();

            }}