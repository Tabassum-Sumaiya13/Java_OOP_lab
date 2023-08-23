public class Comics {
        public void foo(){
            System.out.println("foo");
        }
        public void bar(){
            System.out.println("bar");
        }
    }
 class Marvel extends Comics {
    public Marvel() {
        this(1000);
    }

    public Marvel(int val) {
        System.out.println("Value: " + val);
    }

    public void foo() {
        super.foo();
        System.out.println("Tony Stark");
    }

    public void foo(double val) {
        System.out.println("Steve Rogers");
        System.out.println("Value: " + val);
    }

    public void fubar() {
        bar();
    }
        public static void main(String[] args) {
        Marvel obj = new Marvel();
            obj.foo();
            obj.foo(50);
            obj.fubar();
        }
    }
