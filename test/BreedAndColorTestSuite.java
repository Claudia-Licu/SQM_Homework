import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(BreedAndColorCategory.class)
@Suite.SuiteClasses({
        CatTest.class
})
public class BreedAndColorTestSuite {
}
