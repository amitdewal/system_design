package systemDesign.solid.srp.violation;
//What is the Single Responsibility Principle (SRP)?

//Single Responsibility Principle(SRP) states that “A class should have only ONE reason to
//change”, meaning it should have ONE and ONLY ONE job or responsibility.
//Meaning, if the class has multiple jobs or responsibilities, changes to one responsibility might affect or break the
//other critical responsibilities, making the code bloated, fragile, and harder to maintain. Hence, the Single
//Responsibility Principle(SRP) focuses on restricting the concern to only a single responsibility.

// # Code Example: Violating SRP
public class Marker {
	String name;
	String color;
	int price;
	int year;

	public Marker(String name, String color, int price, int year) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.year = year;
	}
	
	
	
	

}
