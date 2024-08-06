import java.util.Scanner;

public class ProfitLoss {
    static void Calculate(int Cost, int Selling) {
        int ProfLOss = Selling - Cost;
        if(ProfLOss == 0) {
            System.out.println("No profit or No lose");
        } else if (ProfLOss >= 0) {
            System.out.println(" We are profitable " + ProfLOss);
        } else {
            System.out.println(" We are in loss " + ProfLOss);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product coset: ");
        int Cost = sc.nextInt();
        System.out.println("Enter the Selling price of product: ");
        int Selling = sc.nextInt();
        Calculate(Cost, Selling);
        sc.close();
    }
}
