/**
 * Assignment: Powerball is a multi-state lottery that has millions of players each week.  
 * Let's calculate the odds that someone will select all of the right numbers to win the big jackpot!
 * @author Paysen Arballo
 * Date: 10/28/2017
 * Due: 10/29/2017
 */
import java.math.BigInteger;
import java.util.Scanner;



public class LotteryOdds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
// Ask user for input credentials, so this code can compute for more than the initial assignment.
		
		System.out.print("How many numbers would you like to draw?");   // Ask user for number of selected balls
		int k = in.nextInt();
		
		System.out.print("What is the pool size of the drawing?");     // Ask user for pool size to draw from
		int n = in.nextInt();
		
		// Calculate binomial coefficient n		
		BigInteger LotteryOdds =BigInteger.valueOf(1);                
		for (int i= 1; i<= k; i++)
			LotteryOdds = LotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i)); //Formula in correct form
		
		System.out.println("The odds of winning the lottery are 1 in "+LotteryOdds+". Good Luck!"); // Output is odds in winning the lottery
	}
}
		
		