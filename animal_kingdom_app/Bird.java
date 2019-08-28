package animal_kingdom_app;

public class Bird extends AbstractAnimal
{

    public Bird(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }
    
    @Override
    public String move()
    {
        return "Fly";
    }

    @Override
    public String breathe()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

}