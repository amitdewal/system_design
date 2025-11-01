package systemDesign.solid.lsp.violation;

//What is the Liskov Substitution Principle (LSP)?

//Liskov Substitution Principle(LSP) states that the “objects of a superclass should be
//replaceable with objects of its subclasses without breaking the application”.
//That means, if class B is a subtype of class A, then we should be able to replace objects of A with B without
//breaking the behavior of the program. Subclass should extend the capability of the parent class, not narrow it
//down.

//BAD: This design violates LSP
interface Bike {

	void turnOnEngine();

	void turnOffEngine();

	void accelerate();

	void applyBrakes();
}

//Subclass of Bike - implements all Bike class behavior
class MotorCycle implements Bike {
	String company;
	boolean isEngineOn;
	int speed;

	public MotorCycle(String company, int speed) {
		this.company = company;
		this.speed = speed;
	}

	@Override
	public void turnOnEngine() {
		this.isEngineOn = true; // turn on the engine!
		System.out.println("Engine is ON!");
	}

	@Override
	public void turnOffEngine() {
		this.isEngineOn = false; // turn off the engine!
		System.out.println("Engine is OFF!");
	}

	@Override
	public void accelerate() {
		this.speed = this.speed + 10; // increase the speed
		System.out.println("MotorCycle Speed: " + this.speed);
	}

	@Override
	public void applyBrakes() {
		this.speed = this.speed - 5; // decrease the speed
		System.out.println("MotorCycle Speed: " + this.speed);
	}
}

//This class violates LSP!
class Bicycle implements Bike {
	String brand;
	Boolean hasGears;
	int speed;

	public Bicycle(String brand, Boolean hasGears, int speed) {
		this.brand = brand;
		this.hasGears = hasGears;
		this.speed = speed;
	}

	// LSP Violation: Strengthening preconditions
	// Bicycle changes the behavior of turnOnEngine
	@Override
	public void turnOnEngine() {
		throw new AssertionError("Detail Message: Bicycle has no engine!");
	}

	// Bicycle changes the behavior of turnOffEngine
	@Override
	public void turnOffEngine() {
		throw new AssertionError("Detail Message: Bicycle has no engine!");
	}

	@Override
	public void accelerate() {
		this.speed = this.speed + 10; // increase the speed
		System.out.println("Bicycle Speed: " + this.speed);
	}

	@Override
	public void applyBrakes() {
		this.speed = this.speed - 5; // decrease the speed
		System.out.println("Bicycle Speed: " + this.speed);
	}

}

//Usage example - demonstrates the LSP violations
public class LSP_Violartions_Demo {
	public static void main(String[] args) {
		// create the objects
		MotorCycle motorCycle = new MotorCycle("HeroHonda", 10);
		Bicycle bicycle = new Bicycle("Hercules", true, 10);

		// use the objects
		// Works fine with MotorCycle - implements all Bike class behavior
		motorCycle.turnOnEngine();
		motorCycle.accelerate();
		motorCycle.applyBrakes();
		motorCycle.turnOffEngine();
		// Client expects to be able to see the same behavior with Bicycle
		bicycle.turnOnEngine(); // fails to implement Bike class behavior
		bicycle.accelerate();
		bicycle.applyBrakes();
		bicycle.turnOffEngine(); // fails to implement Bike class behavior
	}
}

//Problems with the Above Code
//Not all bikes have engines(eBikes and Bicycles), but the base class forces the turnOnEngine() method.
//Bicycle throws an exception, violating the expected contract.
//Client code cannot safely treat all Bike subclasses uniformly.
