public class Books {
    void description(){
        System.out.println("Books awsome");
    }

}
class PaperBook extends Books{
    void description(){
        System.out.println("paper back");
    }
    void put(int pageno){
        System.out.println("put"+pageno);
    }

    public static void main(String[] args) {
        Books book1;
        book1=new Books();
         PaperBook book2=new PaperBook();
        book1.description();
        book2.description();
        book2.put(50);

    }
}
