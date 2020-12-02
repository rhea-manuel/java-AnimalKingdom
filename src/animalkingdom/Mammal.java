package animalkingdom;

public class Mammal extends Animal{

    public Mammal (String name, int year)
    {
        super(name, year);
    }

    public String move()
    {
        return "walk";
    }

    public String breathe()
    {
        return "lungs";
    }

    public String reproduce()
    {
        return "live births";
    }
}
