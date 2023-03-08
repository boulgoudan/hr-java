package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 * This is the Person class.
 */
public class Person {
  /**
   * Person first name.
   */
  private String firstname;
  
  /**
   * Person last name.
   */
  private String lastname;
  
  /**
   * Person gender.
   */
  private String gender;
  
  /**
   * Person birth date.
   */
  private String birthdate;
    
  /**
   * Person email.
   */
  private String email;
    
  /**
   * Person Constructor.
   *
   * @param fn The first name
   * @param ln The last name
   * @param g The gender
   * @param bd Birth date
   * @param e Email
   */
  public Person(String fn, String ln, String g, String bd, String e) {
    this.firstname = fn;
    this.lastname = ln;
    this.gender = g;
    this.birthdate = bd;
    this.email = e;
  }

  /**
   * Person name setter.
   *
   * @param fn The first name
   * @param ln The last name
   */
  public void setName(String fn, String ln) {
    this.firstname = fn;
    this.lastname = ln;
  }

  /**
   * Person name getter.
   *
   * @return The name
   */
  public String getName() {
    String ln = this.lastname;
    return this.firstname + " " + ln.toUpperCase();
  }

  /**
   * Person name getter.
   *
   * @return name
   */
  public String getName2() {
    String ln = this.lastname;
    return ln.toUpperCase() + ", " + this.firstname;
  }

  /**
   * Person gender setter.
   *
   * @param g The gender
   */
  public void setGender(String g) {
    this.gender = g;
  }
    
  /**
   * Person gender getter.
   *
   * @return The gender
   */
  public String getGender() {
    return this.gender;
  }
    
  /**
   * Person birth date setter.
   *
   * @param bd Birth date
   */
  public void setBirthdate(String bd) {
    this.birthdate = bd;
  }
    
  /**
   * Person birth date getter.
   *
   * @return Birth date
   */
  public String getBirthdate() {
    return this.birthdate;
  }
    
  /**
   * Person email setter.
   *
   * @param e Email
   */
  public void setEmail(String e) {
    this.email = e;
  }
    
  /**
   * Person email getter.
   *
   * @return Email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Person age.
   *
   * @return Integer
   * @throws IllegalArgumentException if age is more than 130
   * @throws ParseException if birth date parse exception occured
   */
  public Integer getAge() throws IllegalArgumentException, ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
    Date d = sdf.parse(this.getBirthdate());

    Calendar c = Calendar.getInstance();
    c.setTime(d);
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) + 1;
    int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        
    LocalDate birthdate = LocalDate.of(year, month, dayOfMonth);

    int age = Period.between(birthdate, LocalDate.now()).getYears();
        
    if (age > 130) {
      throw new IllegalArgumentException("Age should be less than 130");
    }
        
    return age;
  }
    
    
  /**
   * Check email nomenclature.
   *
   * @return true/false
   */
  public Boolean checkEmail() {
    Boolean isValid = true;

    return isValid;
  }

  /**
   * Test the Web Hook
   */
  public Boolean testWebHook() {
    return true;
  }
}
