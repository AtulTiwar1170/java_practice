import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a digit (0-9): ");
        int digit = scanner.nextInt(); 
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (digit >= 0 && digit <= 9) {
            System.out.println(words[digit]);
        } else {
            System.out.println("Invalid input. Please enter a digit between 0 and 9.");
        }
        scanner.close();
    }
}