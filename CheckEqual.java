import java.util.Scanner;


public class CheckEqual {
    static void CheckEqualOrNot(int num, int num2) {
        if(num == num2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num = sc.nextInt();
        System.out.println("Enter the value of num1");
        int num2 = sc.nextInt();
        CheckEqualOrNot(num, num2);
        sc.close();
    }
}
