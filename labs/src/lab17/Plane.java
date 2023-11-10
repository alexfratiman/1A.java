package lab17;

public class Plane extends Token {
	static int maxSpeed = 360;
	private int height;
	
	public Plane (int xSize, int ySize, Map map, int height) {
		super(xSize, ySize, map);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void climb(int howHigh) {
		height += howHigh;
	}
	
	public void land() {
		height = 0;
	}
}
