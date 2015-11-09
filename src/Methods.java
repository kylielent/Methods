import java.util.Scanner;
public class Methods {
	public static void main(String[] args) {
		int score;
		//Call the addition game method
		additiongameMethod();
		
	}
	
	public static void additiongameMethod() {
		int score = 0;
		int hardness = 5;
		int StopIndex = 2;
		boolean isanswercorrect;
		
		for (int index = 0; index<StopIndex; index = index+1){
			System.out.println("Howdy");
			isanswercorrect = checkanswermethod(hardness);
			if (isanswercorrect) {
				System.out.println("It was correct");
			}else{ 
				System.out.println("It was not correct");
			}
		}
		
		
		
	}

}
