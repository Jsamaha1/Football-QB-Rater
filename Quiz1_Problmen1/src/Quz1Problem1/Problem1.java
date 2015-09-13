package Quz1Problem1;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// Opens a Scanner
		Scanner input = new Scanner(System.in);
		//Prompts the user for the necessary values
		System.out.println("What is the total touchdowns: ");
		double touchdowns = input.nextInt();
		
		System.out.println("What is the total yards: ");
		double yards = input.nextDouble();
		
		System.out.println("How many interceptions were thrown: ");
		double INT = input.nextDouble();
		
		System.out.println("How many completions were thrown: ");
		double comp = input.nextDouble();
		
		System.out.println("Number of passes attempted: ");
		double ATT = input.nextDouble();
		
		//All data has been collected to begin the calculations
		//Calculations from the wiki on Passer Rating
		double a = (comp/ATT -.3)*5;
		double b = (yards/ATT - 3)*.25;
		double c = (touchdowns/ATT)*20;
		double d = 2.375 - (INT/ATT * 25);
		
		//Calculate the final passer rating
		double PasRat = ((a+b+c+d)/6)*100;
		System.out.printf("The passer rating is: %.1f", PasRat);
		
		//Close the scanner
		input.close();
	}

}
