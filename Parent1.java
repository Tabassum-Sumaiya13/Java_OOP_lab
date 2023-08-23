public class Parent1 {
    int i=10;
    public Parent1(int j){
        System.out.println(i);
        j=j*2;
        this.i=j*10;
    }

}
class Child1 extends Parent1{
    public Child1(int j){
        super(j);
        System.out.println(i);
        this.i=j*20;
    }

    public static void main(String[] args) {
        Child1 n=new Child1(4);
        System.out.println((n.i));
    }
}
