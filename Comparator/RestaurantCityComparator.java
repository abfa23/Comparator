package Comparator;

import java.util.Comparator;

    class RestaurantCityComparator implements Comparator<Restaurant> {
        @Override
        public int compare(Restaurant r1, Restaurant r2) {
            return r1.getCity().compareToIgnoreCase(r2.getCity());
        }
    }