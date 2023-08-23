public class CLassException  {
    public static void main(String[] args) {
        try{
            Divide(10,10);
            System.out.println("in try");
        }
        catch (DivideBYZero e){
            System.out.println(e.getMessage());
        }
    }
    public static void Divide(int a,int b) throws DivideBYZero{
        if(b==0){
            throw new DivideBYZero("Can not divide by zero");
        }
    }

}