import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 12 <=");
        System.out.println();

        System.out.print("S : ");
        String s = ss.nextLine();

        System.out.print("Size n : ");
        int n = sc.nextInt();
 
        String[] arr = new String[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + (i) + "] : ");
            arr[i] = ss.nextLine();
            
        }

        for (int i = 0; i < n; i++) {
            if(s.indexOf(arr[i]) != -1){
                s = s.replaceAll(arr[i], " "); 

            }
  
        }
        if(s.trim() == ""){
            System.out.println("True");
        }else{
            System.out.println("False");
            
        }
    }
}
