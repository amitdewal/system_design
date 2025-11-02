package systemDesign.solid.design.pattern.creational.prototype.problem;

//💡 Basic Idea
//Prototype Pattern means —
//“Instead of creating new objects from scratch every time, make a copy (clone) of an existing object.”
//It’s like saying:
//“Why build everything again when you can duplicate a ready-made model?”

//Use it when:
//Object creation is expensive (like heavy initialization, DB calls, or API calls).
//You want to create copies of complex objects easily.
//You want to avoid using new keyword repeatedly.

//Client
public class DemoProblem {
	public static void main(String[] args) {
		//original object
		Student studentOrg = new Student(1, "Aman", "CSE", 123);
		studentOrg.printDetails();
		
		// create a clone of the student object
		Student studentClone = new Student();
		studentClone.id = studentOrg.id;
		studentClone.name = studentOrg.name;
		studentClone.branch = studentOrg.branch;
		// studentClone.rollNo = studentOrg.rollNo; // Compilation error// because the rollNo field is private
	}
}
