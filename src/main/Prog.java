package main;

import java.text.ParseException;
import java.time.LocalDate;

import junit.runner.Version;
public class Prog {

	public static void main(String[] args) throws ParseException {
		
		Person p =  new Person("Roberto", "Gonzales", "Male", "1975/10/1", "username@techcompany.com");
		System.out.println("Name : " + p.getName());
		System.out.println("Gender : " + p.getGender());
		System.out.println("Birth date : " + p.getBirthdate());
		System.out.println("Age : " + p.getAge());
		
		System.out.println("JUnit version is: " + Version.id());
		//
		Person P1 =  new Person("Albert", "Lachance", "Male", "", "username@techcompany.com");
        int expectedAge = 44;
        LocalDate birthdate = LocalDate.now().minusYears(expectedAge);
        int year = birthdate.getYear();
        int month = birthdate.getMonthValue();
        int day = birthdate.getDayOfMonth();
        System.out.println("P1 Age : " + "" + year + "/" + month + "/" + day);
        P1.setBirthdate("" + year + "/" + month + "/" + day);
        System.out.println("P1 Age : " + P1.getAge());
        //
        Person centenaire =  new Person("Roberto", "Gonzales", "Male", "1875/10/1", "username@techcompany.com");
		System.out.println("Age : " + centenaire.getAge());
	}

}
