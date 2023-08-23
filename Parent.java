public class Parent {

        public  int count = 0;
        public void printDetails(){
            count++;
            System.out.println("I am in Parent Class: " + count);
        }
    }
  class Child extends Parent{
        public  void printDetails()
        {
            count++;
            System.out.println("I am in a Child Class: " + count);
        }
        public static void main(String[] args) {
            Child x1,x2;
            x1=new Child();
            Child x = new Child();
            x.printDetails();
            x.printDetails();
            Parent y = new Parent();
            y.printDetails();
           // Child.printDetails();
            //Parent.printDetails();
            x.printDetails();
        }
    }

