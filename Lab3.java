//Vikrant Suryadevara
import java.util.Scanner;
public class Lab3 {
	// constant value for the Software Package Retail price, which is 99 dollars
	public static final int Retail = 99;
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the total number of software packages ordered");
		// This allows the user to input how much packages they want to order
		double Packages = key.nextDouble();
		// THis gives the total Price of the packages before the discount
		double Total = Retail * Packages;
		// inital percent of the Discount. it has to be intitalized so the program can be optimized better.
		double Discount = 0;
		
		// each if statement checks if the user inputs between 
		if(Packages >= 10 && Packages <= 19)
		{
			// the doubled part is removed because it was defined in line 14
			 Discount = 0.2 * Total;
		}
		else if(Packages >= 20 && Packages <= 49)
		{
			 Discount = 0.3 * Total;
	    }
		else if(Packages >= 50 && Packages <= 99)
		{
			 Discount = 0.4 * Total;
	    }
		else if(Packages >= 100)
		{
			 Discount = 0.5 * Total;
		
	    }
		else
		{
			// Print line that is used if the user enters a value that is outside the range of 10-100+
			System.out.println("Invalid value for the package count! Exiting the Program!");
			return;
		}
		//This gives the total cost after the discount was applied
		double TotalBill = Total - Discount;
		// Prints out the total bill before and after the discount along with how much the discount costs.
		System.out.println("Total Bill Amount (before discount) = $" + Total);
		System.out.println("Amount of discount = $" + Discount);
		System.out.println("Total Bill Amount (after discount) = $" + TotalBill);

}
}