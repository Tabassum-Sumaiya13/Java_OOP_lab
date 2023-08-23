public class DivideBYZero extends ArithmeticException {
    public DivideBYZero(String msg) {
        super(msg);
    }


}
class PassException extends Exception{
    public PassException(String msg){
        super(msg);
    }
}