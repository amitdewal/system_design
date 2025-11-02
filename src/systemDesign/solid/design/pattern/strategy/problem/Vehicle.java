package systemDesign.solid.design.pattern.strategy.problem;

public class Vehicle {
	public void drive() {
		System.out.print("\n" + this.getClass().getSimpleName() + ": ");
		System.out.println("Driving Capability: Normal");

	}

}
