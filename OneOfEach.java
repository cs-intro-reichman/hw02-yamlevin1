
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {
		String str = "";
		boolean isGirl = false;
		boolean isBoy = false;
		int howManyChildren = 0;
		
		//checks until there is a boy and a girl in the family
		while((isGirl && isBoy) != true) {
			double randomGender = Math.random();
			if(randomGender < 0.5) {  //the chance of getting a girl [0,0.5).
				isGirl = true;
				str += "g ";
			}
			else {  //the chance of getting a boy [0.5,1).
				isBoy = true;
				str += "b ";
			}
			howManyChildren++;
		}
		
		System.out.println(str);
		System.out.println("You made it... and you now have " + howManyChildren + " children.");
	}
}
