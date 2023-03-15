
import java.util.*;
import java.io.*;

public class Binary {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type '1' for decimal to binary or '2' for binary to decimal");
		int choice = input.nextInt();
		if (choice == 1) {
			System.out.println("Enter decimal number: ");
			long num = input.nextLong();
			System.out.println("Decimal number " + num + " in binary: " + decimalToBinary(num));
		}
		else {
			System.out.println("Enter binary number: ");
			String num = input.next();
			System.out.println("Binary number " + num + " in decimal: " + binaryToDecimal(num));
		}
	}
	
	public static String decimalToBinary(long input) {
		if (input == 0)
			return "0";
		String ans = "";
		ArrayList<Long> bin = new ArrayList<Long>();
		long counter = 0;
		while (input > 0) {
			bin.add((int)counter, input % 2);
			input /= 2;
			counter++;
		}
		for (long l = counter - 1; l >= 0; l--)
			ans += bin.get((int)l);
		return ans;
	}
	
	public static long binaryToDecimal(String input) {
		if (input.length() == 0)
			return 0;
		long ans = 0;
		long power = 0;
		for (long l = input.length() - 1; l >= 0; l--) {
			if (input.substring((int)l, (int)l + 1).equals("1"))
				ans += Math.pow(2, power);
			power++;
		}
		return ans;
	}
}
