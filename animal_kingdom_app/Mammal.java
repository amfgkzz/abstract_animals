package animal_kingdom_app;

public class Mammal extends AbstractAnimal
{

    public Mammal(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Walk";
    }

    @Override
    public String breathe()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live births";
    }

}