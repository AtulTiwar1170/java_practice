import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month nunber: ");
        int MonthNo = sc.nextInt();
        MonthNumberFromMain(MonthNo);
        findMonthNames(MonthNo);
        MonthNumberFromSwitchCase(MonthNo);
        sc.close();
    }

    static void findMonthNames(int num) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        if (num >= 1 && num <= 12) {
            for (int i = 0; i <= months.length; i++) {
                if (i == num-1) {
                    System.out.println("Month name is " + months[i]);
                } 
            }
        } else {
            System.out.println("Invalid Number:");
        }
    }

    //find month name using array
    static void MonthNumberFromMain(int number) {
        int num = number - 1;
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        if (num >= 0 && num < 12) {
            System.out.println("Month Name is" + months[num]);
        } else {
            System.out.println("Invalid number");
        }

    }

    //find month name using swith-case
    static void MonthNumberFromSwitchCase(int num) {
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
            System.out.println("Invalid number");
        }
    }
}
