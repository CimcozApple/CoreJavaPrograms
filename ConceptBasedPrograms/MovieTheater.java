import java.util.Scanner;

/*
Problem Statement:
An old-style movie theater has a simple profit program. Each customer pays $5 per
ticket. Every performance costs the theater $20, plus $.50 per attendee. Develop the
program that accepts the number of attendees (of a show) and calculates how much
income the show earns.
static float calculateProfit( int numAttendees)*/
public class MovieTheater {
	static float calculateProfit( int numAttendees)
	{
		int totalEarn= numAttendees * 5;
		float costPrice = (float) (20 + (numAttendees*0.5)); 
		return (totalEarn - costPrice) ;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no of attendees:");
		int numAttendees = sc.nextInt();
		float profit = calculateProfit(numAttendees);
		System.out.print("Show earned the income "+profit);
		sc.close();

		

	}

}
