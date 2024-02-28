import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write a number to be reversed: ");
		String number = scanner.nextLine();

		for(int i = number.length() -1; i >= 0; i--) {
			System.out.print(number.charAt(i));
		}
	}

}
