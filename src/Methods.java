import java.util.Scanner;
public class Methods {
	public static void main(String[] args) {
		int score;
		//Call the addition game method
		additiongameMethod();
		
	}
	
	public static void additiongameMethod() {
		System.out.println("Inside the addition game method.");
		int hardness = 5;
		int score = 0;
		int hardnesslevel = 2;
		
		//Set up my for loop to go through the number of rounds
		
		int NumberofRounds = 3;
		for (int roundnumber = 1; 
		roundnumber <= NumberofRounds;
		roundnumber = roundnumber +1){
			System.out.println("Inside the for loop. Round: " + roundnumber);
			boolean isanswercorrect = getandcheckstudentanswer(hardness);
			if (isanswercorrect){
				System.out.print("Your score is " + score + " and is now ");
				score = score + hardness;
				System.out.println(score + "." );
				
				if (roundnumber<NumberofRounds){
					System.out.print("Your hardness was " + hardness + " and is now ");
					if (hardness > 5){
						hardness = hardness / hardnesslevel;
					}
						System.out.println(hardness + ".");
					}
					
				}
			}
				System.out.println("The game is complete.");
				System.out.println("Your final score was " + score);
		}
	
	
	public static boolean getandcheckstudentanswer(int hardness) {
		System.out.println("Inside get and check student answer method.");
		System.out.println("Add two integers together and give an integer back.");
		int number1 = (int)(Math.random () * hardness);
		int number2 = (int)(Math.random () * hardness);
		System.out.println("Add " + number1 + " and " + number2 + ".");
		//Scanner get = new Scanner(System.in);
		//studentanswer = input.nextInt();
		Scanner get = new Scanner(System.in);
		int studentanswer = get.nextInt();
		if(studentanswer == (number1 + number2)){
			System.out.println("Good work, your answer is correct");
			return true;
		}else
			System.out.println("Nice try, but the correct answer was " + (number1 + number2));
		
		return false;
	}
}
			
	


