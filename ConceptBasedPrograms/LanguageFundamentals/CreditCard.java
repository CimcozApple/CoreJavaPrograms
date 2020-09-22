import java.util.Scanner;

/*Problem Statement:
Some credit card companies pay back a small portion of the charges a customer makes
over a year. A particular credit card company&#39;s pay back policy is as follows:
1.0.25% for charges up to Rs. 500.
2.0.50% for the next Rs.1000 (that is, the portion between Rs. 500 and Rs. 1500),
3.0.75% for the next Rs.1000 (that is, the portion between Rs. 1500 and Rs. 2500),
4.1.0% for charges above Rs2500.
Thus, a customer who charges Rs. 400 a year receives Rs.1.00,
which is 0.25 x 1/100 x 400, and
one who charges Rs1, 400 a year receives Rs. 5.75,
which is 1.25 = 0.25 x 1/100 x 500 for the first Rs. 500 and 0.50 x 1/100 x 900 = 4.50 for
the next Rs. 900. Determine by hand the pay backs amount for a customer who charged
Rs. 2000 and one who charged Rs. 2600.
Define the program, which accepts a charge amount and computes the corresponding
pay back amount.
static float calLoan(int age,char gender,String job,int asset)*/

public class CreditCard {
	static float calLoan(int amt)
	{
		float charge=(float) 0.0;
		
		if(amt <= 500)
		{
			charge+=0.25*1/100*amt;
			return charge;
		}
		else if (amt > 500 && amt <=1500)
		{
			charge +=0.25*1/100*500;
			amt=amt-500;
			charge +=0.50*1/100*amt;
			return charge;
		}
		else if (amt >1500 && amt <=2500)
		{
			charge +=0.25*1/100*500;
			amt= amt-500;
			charge += 0.50*1/100*1000;
			amt= amt-1000;
			charge += 0.75*1/100*amt;
			return charge;
		}
		else
		{
			charge +=0.25*1/100*500;
			amt= amt-500;
			charge += 0.50*1/100*1000;
			amt= amt-1000;
			charge += 0.75*1/100*1000;
			amt = amt-1000;
			charge += 1.0*1/100*amt;
			return charge;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charge amount:");
		int amt=sc.nextInt();
		float result=calLoan(amt);
		System.out.println("Pay back amount:"+result);
		sc.close();

		
	}

}
