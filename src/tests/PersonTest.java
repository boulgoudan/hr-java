package tests;

import java.text.ParseException;
import java.time.LocalDate;
import junit.framework.TestCase;
import main.Person;
import org.junit.Test;

/**
 * This is the PersonTest class.
 */
public class PersonTest extends TestCase {
  @Test
  public void testTrue() {
    assertTrue(true);
  }
  
  /*
  @Test
  public void testFalse() {
    fail("Not yet implemented");
  }
  */
  
  @Test
  public void testGetName() {
    Person p1 = new Person("Albert", "Lachance", "Male", "1989/05/25", "username@company.com");
    assertEquals("Albert LACHANCE", p1.getName());
  }

  @Test
  public void testGetGender() {
    Person p1 = new Person("Albert", "Lachance", "Male", "1975/12/16", "username@company.com");
    assertEquals("Male", p1.getGender());
  }

  @Test
  public void testGetAge() throws ParseException {
    // Arrange
    Person p1 =  new Person("Albert", "Lachance", "Male", "", "username@techcompany.com");
    int expectedAge = 44;
    LocalDate birthdate = LocalDate.now().minusYears(expectedAge);
    int year = birthdate.getYear();
    int month = birthdate.getMonthValue();
    int day = birthdate.getDayOfMonth();
        
    // Act
    p1.setBirthdate("" + year + "/" + month + "/" + day);
        
    // Assert
    assertEquals((Integer) expectedAge, p1.getAge());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetAgeError() throws ParseException {

    // Arrange
    Person p2 =  new Person("Sylvie", "Lacroix", "Female", "1975/10/1", "");

    // Act
    int age = p2.getAge();
  }

  @Test
  public void testCheckEmail() {
    Person p1 =  new Person("Albert", "Lachance", "Male", "1975/12/16", "username@techcompany.com");
    assertTrue(p1.checkEmail());
  }
}
