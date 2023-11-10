package lab18;

public class RacingCar extends Car {
	private String driver;
	private int turboFactor;
	
	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getTurboFactor() {
		return turboFactor;
	}
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	// @override doesn't work?
	public void accelerate (int seconds) {
		super.accelerate(seconds);
		super.setSpeed(super.getSpeed()* this.turboFactor);
		
	}
	
	
}
