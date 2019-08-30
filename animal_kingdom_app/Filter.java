package animal_kingdom_app;

import java.util.List;

public interface Filter 
{
    default List<T> sortByYear(List list)
    {
        return list;
    }
    // List sortByAlphabet();
    // List sortByMovement();
    // List sortByBreath();
    // List sortByBreath();
    // List sortByCategory();

    // default List sortByAlphabet();
    
}