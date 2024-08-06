import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        SwapWithoutVariable(a, b);
        UsingThirdVariable(a, b);
        UsingXor(a, b); //  xor the   
        sc.close();
    }

             //Swaping witghout using third variable
    static  void SwapWithoutVariable(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 == " + num1);
        System.out.println("num2 == " + num2);
    }
            //Swapinmg using third variable
    static void UsingThirdVariable(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Swaping third variable num1 == " + num1);
        System.out.println("Swaping third variable num2 == " + num2);
    }

    static void UsingXor(int num1, int num2) {
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);
    }
    
}