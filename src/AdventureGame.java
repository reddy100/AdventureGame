import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String firstChoice = promptUser(sc, "You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
		firstChoice = check(sc, firstChoice, "kitchen", "upstairs");
		if (firstChoice.equals("kitchen"))
		{
			String secondChoice = promptUser(sc, "There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
			secondChoice = check(sc, secondChoice, "refrigerator", "cabinet");
			if (secondChoice.equals("refrigerator"))
			{
				String thirdChoice = promptUser(sc, "Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
				thirdChoice = check(sc, thirdChoice, "yes", "no");	
				if(thirdChoice.equals("yes"))
				{
					System.out.println("A portal to another dimension opens up and you are pulled into it by the devil himself.");
				}
				else
				{
					System.out.println("You die of starvation... eventually.");
				}
			}
			else
			{
				String thirdChoice = promptUser(sc, "Inside the cabinet you find a cell phone. You pick it up and notice it is running low on battery. So you can only make one call. Do you call the \"cops\" or do you call for \"pizza\"");
				thirdChoice = check(sc, thirdChoice, "cops", "pizza");
				if(thirdChoice.equals("cops"))
				{
					System.out.println("The police department's servers are down so your call gets cut. The phone makes a loud noise before it dies. The shadow finds you and the last thing you see before your death is a familiar face");
				}
				else
				{
					System.out.println("You order pizza and are driven home by the delivery man");
				}
			}
		}
		else 
		{
			String secondChoice = promptUser(sc,"Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?");
			secondChoice = check(sc, secondChoice, "bedroom", "bathroom");
			if (secondChoice.equals("bedroom"))
			{
				String thirdChoice = promptUser(sc, "You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\"");
				thirdChoice = check(sc, thirdChoice, "yes", "no");	
				if(thirdChoice.equals("yes"))
				{
					System.out.println("A portal to another dimension opens up and you are pulled into it by the devil himself. HAHAHA THERE IS NO ESCAPING ME");
				}
				else
				{
					System.out.println("The shadow was hiding in the closet. And it strikes you form behind when you turn to leave. Moral of the story: Never leave a half opened closet door unopened. ");
				}
			}
			else
			{
				String thirdChoice = promptUser(sc, "You smell a stench as you open the bathroom. Do you \"turn on\" the light to investigate or do you \"leave\"?");
				thirdChoice = check(sc, thirdChoice, "turn on", "leave");
				if(thirdChoice.equals("turn on"))
				{
					System.out.println("There is rotting spaghetti in the tub. You use it to rappel down the side of the house to freedom");
				}
				else
				{
					System.out.println("You slip on a banana peel and with a thud fall onto the floor. Darkness!!");
				}
			}
			System.out.println("GAME OVER. Hope you had fun dying. ");
		}

	}
	
	//prompts user for a repsonse
	public static String promptUser(Scanner sc, String prompt)
	{
		String userInput=" ";
		System.out.println(prompt);
		userInput = sc.next();
		userInput = userInput.toLowerCase();
		return userInput;
	}
	
	//checks if the input was one of the correct responses
	//if not it keeps prompting a user for a correct response until they provide one
	public static String check(Scanner sc, String choice, String correct1, String correct2)
	{
		while(!choice.equals(correct1) && !choice.equals(correct2))
		{
			System.out.println("Incorrect choice. You are doomed to stay here until you choose a correct path");
			choice = sc.next();
		}
		return choice;
	}
}
