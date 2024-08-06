
import java.util.Scanner;;
public class Find_Days {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the month number: ");
        int MonthNo = sc.nextInt();
        int[] Month = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        if( MonthNo >= 1 && MonthNo <= 12) {
            for (int i = 0; i <= Month.length; i++ ) {
                if(i == MonthNo-1) {
                    System.out.println(" No. of days in month is " + Month[i]);
                } 
            }
        }
        sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
