package systemDesign.solid.design.pattern.strategy.solution.context;

import systemDesign.solid.design.pattern.strategy.solution.strategies.DriveStrategy;

//Concrete context subclass
public class OffRoadVehicle extends Vehicle {

 OffRoadVehicle(DriveStrategy driveStrategy) {
     super(driveStrategy);
 }
}

