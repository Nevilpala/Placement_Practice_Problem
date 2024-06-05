import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 9 <=");
        System.out.println();

        System.out.print("Size n : ");
        int n = sc.nextInt();
        
        int min = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array["+(i)+"] : ");
            arr[i] = sc.nextInt();
            if(i==0){
                min =  arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Ans : "+ min);
    }
}
