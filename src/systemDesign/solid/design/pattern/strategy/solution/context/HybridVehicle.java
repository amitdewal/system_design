package systemDesign.solid.design.pattern.strategy.solution.context;

import systemDesign.solid.design.pattern.strategy.solution.strategies.DriveStrategy;

//Concrete context subclass
public class HybridVehicle extends Vehicle {

 public HybridVehicle(DriveStrategy driveStrategy) {
     super(driveStrategy);
 }
}
