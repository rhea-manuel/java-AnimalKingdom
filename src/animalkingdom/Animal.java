package animalkingdom;

abstract class Animal 
{
    private static int maxId;

    private int id;
    private String name;
    private int year;

    public Animal(String name, int year)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.year = year;
    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return name+" was found in "+year+", moves by "+move()+ ", uses "+ breathe()+" and reproduces by "+reproduce();
    }
}