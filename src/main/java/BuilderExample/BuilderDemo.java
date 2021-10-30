package BuilderExample;

import BuilderExample.builders.CarBuilder;
import BuilderExample.builders.CarManualBuilder;
import BuilderExample.cars.Car;
import BuilderExample.cars.Manual;
import BuilderExample.director.Director;

public class BuilderDemo {
    public static void run ()
    {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built: " + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}