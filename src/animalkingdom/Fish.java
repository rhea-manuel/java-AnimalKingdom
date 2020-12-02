package animalkingdom;

public class Fish extends Animal{

    public Fish (String name, int year){
        super(name, year);
    }

    public String move()
    {
        return "swim";
    }

    public String breathe()
    {
        return "gills";
    }

    public String reproduce()
    {
        return "eggs";
    }
}
