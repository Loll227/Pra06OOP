package verwaltungMitarbeiter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	String surName, firstName;
	String street, city;
	int zip;
	static int counter = 0;
	GregorianCalendar birthDay;
	GregorianCalendar today;

	public Person(String surName, String firstName, String street, String city,
			int zip, int day, int month, int year) {
		this.surName = surName;
		this.firstName = firstName;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.birthDay = new GregorianCalendar(year,month-1, day);
		this.today = new GregorianCalendar();
		Person.counter++;
	}
	public Person(String surName , String firstName , GregorianCalendar birthday)
	{
		this.surName = surName;
		this.firstName = firstName;
		this.birthDay = new GregorianCalendar();
	}
	public Person(String surName, String firstName , int day, int month, int year)
	{
		this.surName = surName;
		this.firstName = firstName;
		this.birthDay = new GregorianCalendar(year,month-1, day);
		this.today = new GregorianCalendar();
	}
	
	public int getAge() {
		int age = today.get(Calendar.YEAR)-birthDay.get(Calendar.YEAR);
		if (today.get(Calendar.MONTH) < birthDay.get(Calendar.MONTH)) {
			age--;
		} else if (today.get(Calendar.MONTH) == birthDay.get(Calendar.MONTH)) {
			if (today.get(Calendar.DATE) < birthDay.get(Calendar.DATE)) {
				age--;
			}
		} else {
			// nothin todo
		}
		return age;
	}
	
	public String toString() {
		return String.format("%20s,%10s %5d", surName, firstName, this.getAge());
	}

	public int getCounter() {
		return counter;
	}

}
