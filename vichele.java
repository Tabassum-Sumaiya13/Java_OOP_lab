public class vichele {
    private String brand;
    private String model;
    static {
        System.out.println("ini vi class");
    }
    {
        System.out.println("ini an instance of vi");
    }
    public vichele(){
        System.out.println("creating default");
        brand="unknown";
    }
    public vichele(String brand,String model){
        System.out.println("customised "+brand+" "+model);
        this.model=model;
        this.brand=brand;
    }
    public void honk(){
        System.out.println("hoking");
    }
    public void honk(String sound){
        System.out.println("honking"+sound);
    }
    static {
        System.out.println("making sure");
    }
    public void info(){
        System.out.println("model"+model+" "+brand);
    }

    public static void main(String[] args) {
        vichele vi=new vichele();
        vi.honk();
        vi.info();
        vichele truck=new vichele("ford","150");
        truck.honk("loud");
        truck.info();
    }


}
