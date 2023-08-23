class Mid1 {
    int x = 10;

    {
        x = 20;
        System.out.println("@Block=" + x);
    }

    public Mid1(int x1, int x2) {
        x = x1 + x2;
        System.out.println("@Constructor-2=" + x);
    }

    public Mid1(int x1) {
        this(100, 200);
        x = x1;
        System.out.println("@Constructor-1=" + x);

    }

    public Mid1() {
        this(50);
        x = 30;
        System.out.println("@Constructor-0=" + x);
    }
}
class InitBlock {
     public static void main(String[] args) {
         Mid1 obj1 = new Mid1(30);
         System.out.println("@End=" + obj1.x);
     }
 }