
public class person {
    private int id;
    private String name;

    public person (String n){
        name = n;
    }

    public person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
