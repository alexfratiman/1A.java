package lab07;

public class Lab7 {
	
	public void start() {
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		System.out.println(sum(numbers));
		System.out.println(average(numbers));
		System.out.println(min(numbers));
		System.out.println(max(numbers));
		System.out.println(index(numbers));
		
	}
	
	public int sum(int[] num){
		int sum = 0;
		for(int i=0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	public int average(int[] num){
		int numAmount = 0;
		int sum = 0;
		for(int i=0; i < num.length; i++) {
			sum += num[i];
			numAmount += 1;
		}
		return sum/numAmount;
	}
	
	public int min(int[] num){
		int min = num[0];
		for(int i=0; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		return min;
	}
	
	public int max(int[] num){
		int max = num[0];
		for(int i=0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}
	
	public int index(int[] num){
		int index = 0;
		for(int i=0; i < num.length; i++) {
			if(num[i] == 0) {
				index = i;
			}
		}
		return index;
	}
	
	

}
