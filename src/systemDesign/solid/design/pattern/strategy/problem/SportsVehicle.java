package systemDesign.solid.design.pattern.strategy.problem;

public class SportsVehicle extends Vehicle {

	// Overriding the drive method to provide specific behavior for sports vehicles
	@Override
	public void drive() {
		System.out.print("\n" + this.getClass().getSimpleName() + ": ");
		System.out.println("Driving Capability: Sports");
	}

}
