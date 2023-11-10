package lab17;

public class Submarine extends Token {
	static int maxSpeed = 15;
	private int depth;
	
	public Submarine (int xSize, int ySize, Map map, int depth) {
		super(xSize, ySize, map);
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public void dive(int howDeep) {
		depth += howDeep;
	}
	
	public void surface() {
		depth = 0;
	}
	
	

}
