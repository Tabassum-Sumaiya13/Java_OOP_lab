public class Movie {
    private String name;
    protected String orgin;
    public String genre;
    public float rating;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getOrgin(){
    return orgin;
    }
    public void setOrgin(String orgin){
        this.orgin=orgin;
    }
    public Movie(String name,String orgin,String genre,float rating){
        this.name=name;
        this.orgin=orgin;
        this.genre=genre;
        this.rating=rating;
    }
    public Movie(String name,String genre){
        this.name=name;
        this.genre=genre;
    }
    public void voidDetails(){
        System.out.println("you are watching"+""+getName()+"\n"+"orgin:"+ getOrgin()+"\n"+"genre:"+genre+"\n"+"rating:"+rating);
    }



    public static void main(String[] args) {
        Movie movie1=new Movie("star land","horror","new",2.0f);
        movie1.rating=0.0f;
        movie1.setName("king land");
        movie1.setOrgin("comedy");
        movie1.voidDetails();
    }

    }
