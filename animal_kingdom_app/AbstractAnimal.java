package animal_kingdom_app;

public abstract class AbstractAnimal
{
//     All animals consume food the same way

// Each animal is assigned a unique number, a name, and year discovered regardless of classification.

// Methods will return a string saying how that animal implements the action

// All animals can move, breath, reproduce. 
// How they do that, so what string should get returned when the method is executed, varies by animal type.

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
}