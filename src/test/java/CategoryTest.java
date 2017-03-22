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

  @Test
  public void all_returnsAllInstancesOfCategory_true() {
    Category firstCategory = new Category("Home");
    Category secondCategory = new Category("Work");
    assertEquals(true, Category.all().contains(firstCategory));
    assertEquals(true, Category.all().contains(secondCategory));
  }

  @Test
  public void clear_emptiesAllTasksFromArrayList_0() {
    Category testCategory = new Category("Home");
    Category.clear();
    assertEquals(0, Category.all().size());
  }

  @Test
  public void getId_categoriesInstantiateWithID_1() {
    Category.clear();
    Category testCategory = new Category("Home");
    assertEquals(1, testCategory.getId());
  }

  @Test
  public void find_returnsCategoryWithSameId_secondCategory() {
    Category.clear();
    Category firstCategory = new Category("Home");
    Category secondCategory = new Category("Work");
    assertEquals(secondCategory, Category.find(secondCategory.getId()));
  }

  @Test
  public void getTasks_initiallyReturnsEmptyList_ArrayList() {
    Category.clear();
    Category testCategory = new Category("Home");
    assertEquals(0, testCategory.getTasks().size());
  }
}
