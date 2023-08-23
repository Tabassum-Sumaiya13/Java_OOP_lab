public class Calculator {
    public int a;
    public int b;
    public Calculator(int firstNumber, int secondNumber){
        this.a = firstNumber;
        this.b = secondNumber;
    }

    public Calculator() {

    }

    public int sum(){
        return a+b;
    }
    public int subtract(){
        return a-b;
    }
}
