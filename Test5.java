import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 5 <=");
        System.out.println();

        // String temp = "101.0";

        System.out.print("Input : ");
        String temp = sc.nextLine();
 
       
        System.out.println("Ans : " + binaryTodecimal(temp));
        System.out.println();

    }

    static double binaryTodecimal(String temp){
        double ans = 0.0; 
        int dotind = temp.indexOf(".");

        if (dotind == -1) {
            dotind = temp.length();
        } else {
            int a = -1;
            for (int i = dotind + 1; i < temp.length(); i++) {
                ans += (temp.charAt(i) - '0') * Math.pow(2, a);
                a--;
            }
        }
        int a = 0;
        for (int i = dotind - 1; i >= 0; i--) {
            ans += (temp.charAt(i) - '0') * Math.pow(2, a);
            a++;
        }
        return ans;
    }
}