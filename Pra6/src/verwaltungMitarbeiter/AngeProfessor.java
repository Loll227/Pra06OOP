package verwaltungMitarbeiter;

public class AngeProfessor extends Angestellte {

	public AngeProfessor(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, double salary, boolean hasKids) 
	{
		super(surName, firstName, street, city, zip, day, month, year, salary);
		this.hasKids = hasKids;
	}
}
