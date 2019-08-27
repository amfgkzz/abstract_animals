package animal_kingdom_app;

public abstract class AbstractAnimal
{

    protected int id;
    protected String name;
    protected int yearDiscovered;

    public AbstractAnimal()
    {

    }

    public AbstractAnimal(int id, String name, int yearDiscovered)
    {
        this.id = id;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public abstract void move();
    public abstract void breath();
    public abstract void reproduce();

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