package animalkingdom;

public class Bird extends Animal{

    public Bird (String name, int year){
        super(name, year);
    }

    public String move()
    {
        return "fly";
    }

    public String breathe()
    {
        return "lungs";
    }

    public String reproduce()
    {
        return "eggs";
    }
}
