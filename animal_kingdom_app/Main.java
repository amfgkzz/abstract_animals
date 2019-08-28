package animal_kingdom_app;

public class Main
{
    public static void createAnimals() 
    {
        Mammal panda = new Mammal("Panda", 1990);
        panda.showState();
    }

    public static void main(String[] args)
    {
        createAnimals();
    }
}