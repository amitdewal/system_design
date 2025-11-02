package systemDesign.solid.design.pattern.strategy.solution.context;

import systemDesign.solid.design.pattern.strategy.solution.strategies.DriveStrategy;

//Concrete context subclass
public class SportsVehicle extends Vehicle {

 public SportsVehicle(DriveStrategy driveStrategy) {
     super(driveStrategy);
 }
}

