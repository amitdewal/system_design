package systemDesign.solid.design.pattern.strategy.solution.strategies;

//Concrete strategy for electric drive mode
public class EVDrive implements DriveStrategy {
	@Override
	public void drive() {
		System.out.println("Driving Capability: Electric");
	}
}
