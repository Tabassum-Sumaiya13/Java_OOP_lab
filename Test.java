public class Test {
    public static int TestA() throws ClassException2{

            System.out.println("Don't forget me!");
            throw new ClassException2("Exception has been thrown from TestA");


    }
    public static void TestB() throws ClassException2{
        int a = TestA();
        if(a == 0){
            System.out.println("Exception in TestB: a is zero.");
        }
        else{
            System.out.println("You should figure out the value of a: " + a);
            throw new ClassException2("Exception from else clause in TestB");
        }
        return;
    }
    public static boolean TestC(boolean val) throws ClassException2 {
        if(!val){
            throw new ClassException2("Exception in TestC");
        }
        return false;
    }
    public static void main(String []args){

        try{
            TestC(false);
        }
        catch(ClassException2 e){
            System.out.println(e);
            try{
                TestB();
            }
            catch(ClassException2 e1){
                System.out.println(e1);
            }
        }
    }

}
