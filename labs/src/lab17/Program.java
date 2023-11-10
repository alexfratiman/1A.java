package lab17;

public class Program {
		public static void main(String[] args) {
			Map map = new Map(500,400);
			Token t1 = new Token(70,30,map);
			Token t2 = new Token(20,50,map);
			Token t3 = new Token(10,10,map);
			System.out.println("token1 co-ords: x is " + t1.getxSize() + " and y is " + t1.getySize());	
			System.out.println("token2 co-ords: x is " + t2.getxSize() + " and y is " + t2.getySize());	
			System.out.println("token3 co-ords: x is " + t3.getxSize() + " and y is " + t3.getySize());	
			
			if(t1.move("east", 100) == false){
				t1 = null;
			}
			else {
			System.out.println("token1 new co-ords: x is " + t1.getxSize() + " and y is " + t1.getySize());	
			}
			
			if(t1.move("s", 20) == false){
				t1 = null;
			}
			else {
				System.out.println("token1 new co-ords: x is " + t1.getxSize() + " and y is " + t1.getySize());	
			}
			
			if(t2.move("south", 100) == false){
				t2 = null;
			}
			else {
				System.out.println("token1 new co-ords: x is " + t2.getxSize() + " and y is " + t2.getySize());	
			}
			
			if(t3.move("n", 500) == false){
				t3 = null;
			}
			else {
				System.out.println("token1 new co-ords: x is " + t3.getxSize() + " and y is " + t3.getySize());	
			}
			
			//Lab 17 
			
			Submarine sub = new Submarine(90, 40,map, 0);
			Plane plane = new Plane(85, 200, map, 0);
				
			sub.dive(50);
			System.out.println("sub is at depth:" + sub.getDepth());
			plane.climb(100);
			System.out.println("plane is at height:" + plane.getHeight());
			sub.surface();;
			System.out.println("sub is now at depth:" + sub.getDepth());
			plane.land();
			System.out.println("plane is now at height:" + plane.getHeight());
			
			if(sub.move("w", 20) == false){
				sub = null;
			}
			else {
				System.out.println("sub's new co-ords: x is " + sub.getxSize() + " and y is " + sub.getySize());
			}
			
			if(plane.move("north", 45) == false){
				plane = null;
			}
			else {
				System.out.println("plane's new co-ords: x is " + plane.getxSize() + " and y is " + plane.getySize());
			}
			
		}
}
