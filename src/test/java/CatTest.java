
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class CatTest {

    Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat();
    }

    @Test
    @Category(BreedAndColorCategory.class)
    public void setBreedTest() throws BreedException {

        String breed = "Sphynx";
        cat.setBreed(breed);

        assertEquals(breed, cat.getBreed());
    }

    @Test(expected = BreedException.class)
    @Category(BreedAndColorCategory.class)
    public void shouldThrowExceptionOnSetBreedTest() throws BreedException {

        String breed = "Cat_Breed_N05";
        cat.setBreed(breed);

        assertEquals(breed, cat.getBreed());
    }

    @Test
    @Category(BreedAndColorCategory.class)
    public void setColorTest() throws ColorException {
        String color = "brown";
        cat.setColor(color);

        assertEquals(color, cat.getColor());
    }

    @Test(expected = ColorException.class)
    @Category(BreedAndColorCategory.class)
    public void shouldThrowExceptionOnSetColorTest() throws ColorException {
        String color = "red";
        cat.setColor(color);

        assertEquals(color, cat.getColor());
    }


    @Test
    public void setNoOfPuppiesTest() throws NoOfKittensException {
        int noOfKittens = 3;
        cat.setNoOfKittens(noOfKittens);

        assertEquals(noOfKittens, cat.getNoOfKittens());
    }

    @Test(expected = NoOfKittensException.class)
    public void shouldThrowExceptionOnSetNoOfPuppiesTest() throws NoOfKittensException {
        int noOfKittens = 1000;
        cat.setNoOfKittens(noOfKittens);

        assertEquals(noOfKittens, cat.getNoOfKittens());
    }
}