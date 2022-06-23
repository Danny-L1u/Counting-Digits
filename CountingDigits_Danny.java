package Grade_11;
import java.io.*;
import java.util.Scanner;

/** This program takes in a starting and an ending page number. Then it finds the number of digits used to number
 * all of the pages between those two page numbers, including the first and last page number. It does this by 
 * looping through all of the page numbers, turning them into strings, then using the .length() function to 
 * determine the number a characters used. The length of the number is added to a total variable which keeps track of all the digits 
 * found so far. Then once the final page loops through, the total count is outputted. 
 * @dliu
 */ 

public class CountingDigits_Danny {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		//Take in variables
		System.out.println("Find how many digits are used to number pages!");
		System.out.print("Input starting page number: ");
		int Start = in.nextInt();
		System.out.print("Input ending page number: ");
		int End = in.nextInt();
		int digit_total = 0;
		
		//Loop through every page starting from the starting page and neding at the ending page
		for (int k = Start; k <= End; k++) {
			//Turn page number into a string, then find the length of the string, then add the length to the total number of digits already found
			digit_total += String.valueOf(k).length();
		}
		
		//Output results
		System.out.println("There are " + digit_total + " digits used to number the " + (End - Start + 1) + " pages");  

	}

}





