/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		int randomNum = (int)(Math.random() * 10);
		int lastNum = 0;
		
		while(lastNum <= randomNum){
			System.out.println(randomNum);
			lastNum = randomNum;
			randomNum = (int)(Math.random() * 10);		
		}	
	}
}
