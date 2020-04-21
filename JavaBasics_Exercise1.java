
public class JavaBasics_Exercise1 {

	public static void main(String[] args) {

		// create all the variables
		double amount = 25;
		double taxRate = 0.07;
		double discountRate = 0.3;

		// calculate the total, tax amount and discount amount
//to calculate the discount amount. i have to get the percentage subtracted from the amount
		double discountAmount = amount * discountRate;
		double taxAmount = amount * taxRate;
		double total = amount - discountAmount + taxAmount;

		String result = 
				  "         Tek School         \n"
				+ "           Receipt          \n"
				+ "\nAmount ................. " + amount + "$"
				+ "\nDicount Rate ........... " + (discountRate*100) +"%"
				+ "\nDiscount Amount .....(-) " + discountAmount + "$"
				
				+ "\nTax Rate ............... " + (taxRate*100) +"%"
				+ "\nTax Amount ......... (+) " + taxAmount + "$"
				+ "\n______________________________ " 
				+ "\nTotal .................. " + total + "$"
				+ "\n______________________________ " 
				+ "\n\n      Visit our Website       "
				+ "\n www.tekschoolofamerica.com     "
				;
		
		System.out.println(result);
		
	}

}
