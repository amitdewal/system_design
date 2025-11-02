package systemDesign.solid.design.pattern.creational.prototype.solution;

public class DemoSolution {

	private static final String Student = null;

	public static void main(String[] args) {
		System.out.println("======= Prototype Design Pattern ======");
		// Create initial prototypes (expensive operations)
		Student student = new Student(5, "Ram", "CSE", 223);
		student.printDetails();

		// Clone objects (fast operations)
		Student studentClone = (Student) student.clone();
		studentClone.setInHighSchool(true);
//		studentClone
		studentClone.printDetails();
		System.out.println("Same object? " + (student == studentClone)); // false
		System.out.println(student.hashCode());
		System.out.println(studentClone.hashCode());
	}
}
