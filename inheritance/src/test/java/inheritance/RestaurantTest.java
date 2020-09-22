package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testRestaurant() {
        Restaurant test = new Restaurant("Mcdonalds");
        assertEquals("Mcdonalds is a restaurant.", test.toString());

        assertEquals("This restaurant serves Fast Food and is garbage. I gave it 1 stars and is 1 $'s.", test.addReview("Fast Food", "garbage", 1, 1));
        test.addReview("Fast Food", "meh", 3, 2);
        assertEquals(2.0, test.getStars(), 1);
        assertEquals(1.5, test.getPriceCat(), 1);
    }
}
