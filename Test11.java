import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 11 <=");
        System.out.println();
        
        System.out.print("Divident : ");
        long divident = sc.nextLong();

        System.out.print("Divisor : ");
        long divisor = sc.nextLong();

        System.out.println("Ans : " + divideNumber(divident,divisor));
        System.out.println(); 
    }

    static long divideNumber(long divident,long divisor){
        
        int count = 0;
        long x = Math.abs(divident);
        long y = Math.abs(divisor);
        while(x >= y){
            x -= y;
            count++; 
        }
        if((divident>=0 && divisor<0) || (divident <0 && divisor>=0)){
            return -count;
        }else{
            return count; 
        }
    }
}
