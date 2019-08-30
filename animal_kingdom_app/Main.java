package animal_kingdom_app;

import java.util.*;

public class Main implements Filter
{

    public static List mammals() 
    {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigFoot = new Mammal("Big Foot", 2021);

        List<Mammal> allMammals = new ArrayList<Mammal>();

        allMammals.add(panda);
        allMammals.add(zebra);
        allMammals.add(koala);
        allMammals.add(sloth);
        allMammals.add(armadillo);
        allMammals.add(raccoon);
        allMammals.add(bigFoot);

        return allMammals;
    }

    public static List birds()
    {
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        List<Bird> allBirds = new ArrayList<Bird>();

        allBirds.add(pigeon);
        allBirds.add(peacock);
        allBirds.add(toucan);
        allBirds.add(parrot);
        allBirds.add(swan);

        return allBirds;
    }

    public static List fishes()
    {
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<Fish> allFishes = new ArrayList<Fish>();

        allFishes.add(salmon);
        allFishes.add(catfish);
        allFishes.add(perch);

        return allFishes;
    }

    public static void main(String[] args)
    {
        List<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();

        animals.addAll(mammals());
        animals.addAll(birds());
        animals.addAll(fishes());

        animals.forEach((a)->System.out.println(a.showState()));

    }
}
