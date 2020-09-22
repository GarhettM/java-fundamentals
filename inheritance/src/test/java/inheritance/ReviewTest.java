package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    @Test
    public void testReview() {

        Review test1 = new Review("Fast Food", "garbage", 1, 1);
        assertEquals("This restaurant serves Fast Food and is garbage.", test1.toString());
    }
}
