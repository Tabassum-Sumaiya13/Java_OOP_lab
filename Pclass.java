public class Pclass {
    void mFnc(){
        System.out.println("hello frm p");
    }
    void mFnc(double d1){
        System.out.println("double value"+d1);
    }

}
class Cclass extends Pclass{
    @Override
    void mFnc() {
        System.out.println("hello frm c");
        super.mFnc(11.22);
    }

    void mFnc(int a1,double d2) {
        mFnc(d2);
        System.out.println("integer"+a1);
    }

    public static void main(String[] args) {
        Pclass pobj=new Pclass();
    Cclass cobj=new Cclass();
    pobj.mFnc();
    cobj.mFnc();
    cobj.mFnc(10,2.99);
    cobj.mFnc(4.145);
    }
}
