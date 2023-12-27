
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args){
		String str = "";
		boolean isGirl = false;
		boolean isBoy = false;
		int howManyChildren = 0;
		
		while((isGirl && isBoy) != true) {
			double randomGender = Math.random();
			if(randomGender < 0.5){
				isGirl = true;
				str += "g ";
			}
			else{
				isBoy = true;
				str += "b ";
			}
			howManyChildren++;
		}
		
		System.out.println(str);
		System.out.println("You made it... and you now have " + howManyChildren + " children.");
	}
}
