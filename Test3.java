import java.util.*;

public class Test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 3 <=");
        System.out.println();
        
        System.out.print("Input : ");
        int n = sc.nextInt();

    
        System.out.println("Trailing Zero : " + trailingZero(n));
        System.out.println(); 
    }

    static int trailingZero(int n){
        int count = 0;  

        while(n>0){
            n/=5;
            count += n;    

        } 
        return count;
    }
}

