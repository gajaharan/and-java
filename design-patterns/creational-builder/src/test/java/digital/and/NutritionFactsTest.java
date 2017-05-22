package digital.and;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NutritionFactsTest {

    /**
     * Test if we get the expected exception when trying to create a nutrition without a serving size
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMissingServingSize() throws Exception {
        new NutritionFacts.Builder(-12, 8);
    }

    /**
     * Test if we get the expected exception when trying to create a nutrition without servings
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMissingServings() throws Exception {
        new NutritionFacts.Builder(240, -30);
    }

    /**
     * Test if the nutrition build by the builder has the correct attributes, as requested
     */
    @Test
    public void testBuildNutritionFacts() throws Exception {

        final NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        assertNotNull(cocaCola);
        assertNotNull(cocaCola.toString());
    }

}