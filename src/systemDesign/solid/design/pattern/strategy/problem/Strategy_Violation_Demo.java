package systemDesign.solid.design.pattern.strategy.problem;

public class Strategy_Violation_Demo {
	public static void main(String[] args) {
		System.out.println("Vehicle Drive Modes: Problem Demo");
		Vehicle vehicle = new Vehicle();

		// Sports vehicle - sports drive mode
		vehicle = new SportsVehicle();
		vehicle.drive();

		// Off-road vehicle - sports drive mode
		vehicle = new OffRoadVehicle();
		vehicle.drive();

		// Passenger vehicle - normal drive mode
		vehicle = new PassengerVehicle();
		vehicle.drive();
	}

}
