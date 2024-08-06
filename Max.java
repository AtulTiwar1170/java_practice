

public class Max {
    public static void main(String[] args) {
        int[] num = { 1, 23, 54, 67, 34, 12};
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if( max < num[i]) {
                max = num[i];
            } else {
                System.out.println("maximum number is: " + max);
            }
        }
        
    }
}
