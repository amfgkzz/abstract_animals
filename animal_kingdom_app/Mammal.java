package animal_kingdom_app;

public class Mammal extends AbstractAnimal
{
    // Mammals move - walk, breath - lungs, reproduce - live births
    public Mammal(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    public String move()
    {
        return "Walk";
    }

    public String breath()
    {
        return "Lungs";
    }

    public String reproduce()
    {
        return "Live births";
    }

}