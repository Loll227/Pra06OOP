package verwaltungMitarbeiter;

public class Angestellte extends Person {

	protected double salary;
	protected boolean hasKids;
	

	public Angestellte(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, double salary) 
	{
		super(surName, firstName, street, city, zip, day, month, year);
		this.salary = salary;
		
		if (this.getAge() >= this.ageThreshold  && !this.hasKids) {
			Angestellte.healthInsurance = nursingCareWithoutKids ;
		} else {
			Angestellte.healthInsurance = nursingCareWithKids; 
		}
	}
	
	private final double getSocialInsuranceFaktor() {
		return 100 -(healthInsurance+ nursingCareInsurance + unemploymentInsurance+retirementInsurance);
	}
	
	public double getNetto() {
		double retVal = (salary * getSocialInsuranceFaktor()/100); 
		return retVal;
	}
	
	public boolean haveToPayTaxes() {
		return getNetto() * 12 > TAXEXEMPTION;
	}

	public String toString() 
	{
		String s= super.toString();
		s += String.format("\t%10b" + "\t"+ "\t%6.2f" , this.haveToPayTaxes(), this.getNetto());
		return s;
	}

}
