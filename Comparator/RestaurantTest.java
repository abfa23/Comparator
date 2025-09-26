package Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RestaurantTest {
    public static void main(String [] args) {
        List<Restaurant> catchList = new ArrayList<>();
        catchList.add(new Restaurant("Café Ploven", "Nørrebro", 5));
        catchList.add(new Restaurant("Da Claudio", "Frederiksberg", 3));
        catchList.add(new Restaurant("Mahalle", "Frederiksberg", 4));

        System.out.println("Original catch:");
        System.out.println(catchList);
        System.out.println();

        //Sort by name
        Collections.sort(catchList, new RestaurantNameComparator());
        System.out.println("Sorted by name: ");
        System.out.println(catchList);
        System.out.println();

        //Sort by city
        Collections.sort(catchList, new RestaurantCityComparator());
        System.out.println("Sorted by city: ");
        System.out.println(catchList);
        System.out.println();

        //Sort by rating
        Collections.sort(catchList, new RestaurantRatingComparator());
        System.out.println("Sorted by rating: ");
        System.out.println(catchList);
        System.out.println();
    }
}
