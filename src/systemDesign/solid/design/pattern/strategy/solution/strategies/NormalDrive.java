package systemDesign.solid.design.pattern.strategy.solution.strategies;

//Concrete strategy for normal drive mode
public class NormalDrive implements DriveStrategy {
	@Override
	public void drive() {
		System.out.println("Driving Capability: Normal");
	}
}
