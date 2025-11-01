package systemDesign.solid.lsp.solution;

abstract class Bike {

	// All Bikes can do these things
	public abstract void accelerate();

	public abstract void applyBrakes();

}

interface Engine {
	void turnOnEngine();

	void turnOffEngine();
}

//GOOD: Following LSP
//Subclass of Bike - implements all Bike class behavior
//As Bicycles do not have engines, we need not implement Engine interface
class Bicycle extends Bike {

	String brand;
	Boolean hasGears;
	int speed;

	public Bicycle(String brand, Boolean hasGears, int speed) {
		this.brand = brand;
		this.hasGears = hasGears;
		this.speed = speed;
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

//Subclass of Bike - implements all Bike class behavior
class MotorCycle extends Bike implements Engine {
	String company;
	boolean isEngineOn;
	int speed;

	public MotorCycle(String company, int speed) {
		this.company = company;
		this.speed = speed;
	}

	public void turnOnEngine() {
		this.isEngineOn = true; // turn on the engine!
		System.out.println("Engine is ON!");
	}

	public void turnOffEngine() {
		this.isEngineOn = false; // turn off the engine!
		System.out.println("Engine is OFF!");
	}

	public void accelerate() {
		this.speed = this.speed + 10; // increase the speed
		System.out.println("MotorCycle Speed: " + this.speed);
	}

	public void applyBrakes() {
		this.speed = this.speed - 5; // decrease the speed
		System.out.println("MotorCycle Speed: " + this.speed);
	}
}

//Usage of LSP-compliant design
public class LSP_Solution_Demo {
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
		// Works fine with Bicycle - implements all Bike class behavior
		bicycle.accelerate();
		bicycle.applyBrakes();

	}

}

//Key Benefits of the Refactored Code
//Prevents Fragile Code: LSP helps avoid situations where subclass behavior violates the expectations set by the
//parent class.
//Improves Flexibility: By designing classes that can be substituted without breaking the parent contract.
//Improved maintainability: Changes to subclasses don't break existing code.
//Promotes Code Reusability: LSP facilitates the reuse of base classes and the creation of new subclasses
//without requiring modifications to existing code.


//Summary
//LSP is vital because it upholds the integrity of your class hierarchy, ensuring that extending functionality or
//creating new subclasses won’t disrupt the program’s existing behavior. It keeps your code clean, modular, and safe
//to evolve.
