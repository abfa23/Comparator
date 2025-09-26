package Comparator;

public class Restaurant {
    private String name;
    private String city;
    private int rating;

    public Restaurant(String name, String city, int rating) {
        this.name = name;
        this.city = city;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + "-" + city + "-" + rating;
    }
}

