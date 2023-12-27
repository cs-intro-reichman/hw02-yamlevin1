/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int userNum = Integer.parseInt(args[0]);
		int experimentsNum = 0;
		int howManyChildrenOverAll = 0;
		int howManyChildrenInOneFamily = 0;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourPlusChildren = 0;
		boolean isGirl = false;
		boolean isBoy = false;
		
		while(experimentsNum < userNum){
			while((isGirl && isBoy) != true) {
				double randomGender = Math.random();
				if(randomGender < 0.5){
					isGirl = true;
				}
				else{
					isBoy = true;
				}
				howManyChildrenOverAll++;
				howManyChildrenInOneFamily++;
			}
			if(howManyChildrenInOneFamily == 2){
				twoChildren++;
			}
			else if(howManyChildrenInOneFamily == 3){
				threeChildren++;
			}
			else{
				fourPlusChildren++;
			}
			experimentsNum++;
			isGirl = false;
			isBoy = false;
			howManyChildrenInOneFamily = 0;	
		}
		
		double averageChildren = (double)howManyChildrenOverAll / (double)userNum;
		
		System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourPlusChildren);
		
		if(twoChildren >= threeChildren && twoChildren >= fourPlusChildren){
			System.out.println("The most common number of children is 2.");
		}
		else if(threeChildren > twoChildren && threeChildren >= fourPlusChildren){
			System.out.println("The most common number of children is 3.");
		}
		else{
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
