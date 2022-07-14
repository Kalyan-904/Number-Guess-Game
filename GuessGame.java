import java.util.*;

public class GuessGame{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		final int max=100;
		int answer,guess;
		String another="y";
		boolean flag = false;
		boolean anotherFlag = true;
		
		while(anotherFlag){
			answer = r.nextInt(max)+1;
			System.out.println("Hey I'm thinking of a number from 1 to "+max+". can you guess what it is?");
			flag = false;
			while(!flag){
				System.out.print("Enter your number : ");
				guess = sc.nextInt();
				if(answer == guess ){
					System.out.println("You are right! Good Job.");
					flag = true;
				}else if(guess < answer){
					System.out.println("Sorry It's a smaller number than the answer, please guess Correctly.");
				}else{
					System.out.println("Sorry It's a bigger number than the answer, Please guess Correctly.");
				}
			}
			System.out.println();
			System.out.println("Do you want to play again?(y/n)");
			another = sc.next();
			if(another.equalsIgnoreCase("y")){
				anotherFlag  = true;
			}else{
				anotherFlag = false;
			}
		}
	}
}
