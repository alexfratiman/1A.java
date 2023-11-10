package lab18;

public class Program {

	public static void main(String[] args) {
		Car[] cars = {new Car("bmw", 40), new RacingCar("porsche", 30, "Cate", 5), new Car("volvo", 25), new RacingCar("bugatti", 60, "Alex", 2)};
		processCars(cars);
	}
	
	public static void processCars(Car[] cars) {
		for(Car c :  cars) {
			c.setSpeed(60);
			c.accelerate(2);
			if(c instanceof RacingCar) {
				RacingCar r = (RacingCar) c;
				System.out.printf("Car %s is driven by %s and has a speed of %d.\n", r.getModel(), r.getDriver(), r.getSpeed());
			}
			else {System.out.printf("Car %s has a speed of %d.\n", c.getModel(), c.getSpeed());}
		}
	}
	
	
}
