import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 10 <=");
        System.out.println();

        System.out.print("Size n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + (i) + "] : ");
            arr[i] = sc.nextInt();
        }
        

        System.out.println("\nAns : " + jumpLength(arr, n));
    }

    static boolean jumpLength(int[] arr,int n){
        int i = 1, j = 0; 
        boolean flag = false;

        while (i < n ) {
            if (j >= n)
                break; 
            i += arr[i];  
            if (i == n - 1) {
                flag = true;
                break;

            }

            j++;
        } 
        return flag;
    }
}