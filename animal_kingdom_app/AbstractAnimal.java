package animal_kingdom_app;

public abstract class AbstractAnimal
{

    protected static int plusId = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;

    public AbstractAnimal()
    {

    }

    public AbstractAnimal(String name, int yearDiscovered)
    {
        plusId++;
        this.id = plusId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    public int getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public String showState(){
        return "{ id=" + id +
                ", name=" + name +
                ", yearDiscovered=" + yearDiscovered + " }";
    }

}