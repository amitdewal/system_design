package systemDesign.solid.design.pattern.strategy.solution.context;

import systemDesign.solid.design.pattern.strategy.solution.strategies.DriveStrategy;

//Concrete context subclass
public class GoodsVehicle extends Vehicle {

 public GoodsVehicle(DriveStrategy driveStrategy) {
     super(driveStrategy);
 }
}

