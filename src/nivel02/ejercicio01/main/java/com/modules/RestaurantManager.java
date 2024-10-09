package nivel02.ejercicio01.main.java.com.modules;

import java.util.HashSet;
import static java.lang.System.*;

public class RestaurantManager {

    public RestaurantManager() {

    }

    public void manageRestaurants() {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("The Good Table", 5));
        restaurants.add(new Restaurant("The Good Table", 4));
        restaurants.add(new Restaurant("The Great Chef", 5));
        restaurants.add(new Restaurant("The Good Table", 5));

        for (Restaurant r : restaurants) {
            out.println(r);
        }
    }
}
