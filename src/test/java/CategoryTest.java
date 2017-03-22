import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {

  @Test
  public void Category_instantiatesCorrectly_true() {
    Category testCategory = new Category("Home");
    assertEquals(true, testCategory instanceof Category);
  }

  @Test
  public void getName_getNameOfCategory_Home() {
    Category testCategory = new Category("Home");
    assertEquals("Home", testCategory.getName());
  }
}
