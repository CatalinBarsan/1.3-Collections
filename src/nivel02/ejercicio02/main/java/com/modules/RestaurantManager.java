package nivel02.ejercicio02.main.java.com.modules;

import java.util.TreeSet;

public class RestaurantManager {

    public RestaurantManager() {

    }

    public void manageRestaurants() {
        TreeSet<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("The Good Table", 5));
        restaurants.add(new Restaurant("The Good Table", 8));
        restaurants.add(new Restaurant("The Good Table", 7));
        restaurants.add(new Restaurant("The Great Chef", 5));
        restaurants.add(new Restaurant("The Great Chef", 9));

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}
