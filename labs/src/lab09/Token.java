package lab09;

public class Token {
	private int xSize;
	private int ySize;
	private Map map;
	
	public Token(int xSize, int ySize, Map map) {
		this.xSize = xSize;
		this.ySize = ySize;
		this.map = map;
	}

	public int getxSize() {
		return xSize;
	}

	public void setxSize(int xSize) {
		this.xSize = xSize;
	}

	public int getySize() {
		return ySize;
	}

	public void setySize(int ySize) {
		this.ySize = ySize;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public boolean move(String direction, int distance) {
		if((direction.toLowerCase() == "east" || direction.toLowerCase() == "e") && (this.xSize + distance) <= map.getxSize()) {
			this.xSize += distance;
		}
		else if((direction.toLowerCase() == "east" || direction.toLowerCase() == "e") && (this.xSize + distance) > map.getxSize()) {
			System.out.println("Can't move that much east, it fell off of the map.");
			return false;
		}
		else if((direction.toLowerCase() == "west" || direction.toLowerCase() == "w") && (this.xSize - distance) >= 0) {
			this.xSize -= distance;
		}
		else if((direction.toLowerCase() == "west" || direction.toLowerCase() == "w") && (this.xSize - distance) < 0) {
			System.out.println("Can't move that much west, it fell off of the map.");
			return false;
		}
		else if((direction.toLowerCase() == "north" || direction.toLowerCase() == "n") && (this.ySize + distance) <= map.getySize()) {
			this.ySize += distance;
		}
		else if((direction.toLowerCase() == "north" || direction.toLowerCase() == "n") && (this.ySize + distance) > map.getySize()) {
			System.out.println("Can't move that much north, it fell off of the map.");
			return false;
		}
		else if((direction.toLowerCase() == "south" || direction.toLowerCase() == "s") && (this.ySize - distance) >= 0) {
			this.ySize -= distance;
		}
		else if((direction.toLowerCase() == "south" || direction.toLowerCase() == "s") && (this.ySize - distance) < 0) {
			System.out.println("Can't move that much south, it fell off of the map.");
			return false;
		}
		else {
			System.out.println("That's not a valid direction.");
		}
			
		return true;
	}
	
	
}
