package Comparator;

import java.util.Comparator;

class RestaurantRatingComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant r1, Restaurant r2) {
        return Integer.compare(r1.getRating(), r2.getRating());
    }
}
