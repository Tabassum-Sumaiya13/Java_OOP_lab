import java.util.Locale;
import java.util.Scanner;

public class Exception_tets {
    public static boolean lower(String pass) {
        if (pass.contains("a")) {
            pass.toCharArray();

            return true;

        }
     else return false;
    }
    public static void test(String pass) throws PassException {
        if (pass.length() < 8) {
            if (lower(pass) == true) {

                throw new PassException("wrong pass");
            }

        }
    }
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password");
        try{
            String pass=sc.next();
            test(pass);
        }catch (PassException p){
            System.out.println(p.getMessage());

    }
}

}
