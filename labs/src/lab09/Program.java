package lab09;

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

		}
}
