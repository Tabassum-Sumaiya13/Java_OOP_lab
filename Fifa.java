public class Fifa {
    private int noOfGoals;
    private String venue;
    public Fifa(){
        System.out.println("who will be the winner");
    }
    public Fifa(int noOfGoals,String venue){
        this();
        this.noOfGoals=noOfGoals;
        this.venue=venue;
    }

    @Override
    public String toString() {
        return "Fifa{" +
                "noOfGoals=" + noOfGoals +
                ", venue='" + venue + '\'' +
                '}';
    }
    public int getNoOfGoals(){
        return noOfGoals;
    }
}
class BrazilFans extends Fifa{
        private int havingWorldCups;

    public BrazilFans(int noOfGoals, String venue, int havingWorldCups) {
        super(noOfGoals, venue);
        System.out.println("brazil will");
        this.havingWorldCups = havingWorldCups;
    }
    public void incrementWorldCup(){
        havingWorldCups +=1;
    }

    @Override
    public String toString() {
        return "BrazilFans{" +super.toString()+
                "havingWorldCups=" + havingWorldCups +
                '}';
    }

}
class ArgentinaFans extends Fifa{
    private int havingWorldCups;

    public ArgentinaFans(int noOfGoals, String venue, int havingWorldCups) {
        super(noOfGoals, venue);
        System.out.println("argentina will");
        this.havingWorldCups = havingWorldCups;
    }
    public void incrementWorldCup(){
        havingWorldCups +=1;
    }
    @Override
    public String toString() {
        return "ArgentinaFans{" +super.toString()+
                "havingWorldCups=" + havingWorldCups +
                '}';
    }

}
class Mid{
    public static void main(String[] args) {
        ArgentinaFans a=new ArgentinaFans(10,"aa",2);
        BrazilFans b=new BrazilFans(111,"bb",5);
        if(a.getNoOfGoals()>=b.getNoOfGoals()){
            a.incrementWorldCup();
        }
        else
            b.incrementWorldCup();
        System.out.println(a.toString());
        System.out.println( b.toString());
    }

}
