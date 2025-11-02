package systemDesign.solid.design.pattern.strategy.solution;

import systemDesign.solid.design.pattern.strategy.solution.strategies.EVDrive;
import systemDesign.solid.design.pattern.strategy.solution.strategies.NormalDrive;
import systemDesign.solid.design.pattern.strategy.solution.strategies.SportsDrive;
import systemDesign.solid.design.pattern.strategy.solution.context.GoodsVehicle;
import systemDesign.solid.design.pattern.strategy.solution.context.HybridVehicle;
import systemDesign.solid.design.pattern.strategy.solution.context.SportsVehicle;
import systemDesign.solid.design.pattern.strategy.solution.context.Vehicle;

public class Strategy_Solution_Demo {
	public static void main(String[] args) {
        System.out.println("###### Strategy Design Pattern ######");
        System.out.println("###### Example: Vehicle Drive Modes ######");

        Vehicle vehicle = new SportsVehicle(new SportsDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();

        vehicle = new HybridVehicle(new EVDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();
    }


}
