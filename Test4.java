import java.util.*;
public class Test4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 4 <=");
        System.out.println(); 

        System.out.print("Input : ");
        int temp = sc.nextInt();
  
        System.out.println("Ans : " + countDigit(temp)); 

    }

    static int countDigit(int temp){
        String s = "";  

        for(int i=1;i<=temp;i++){ 
            s += i; 
            if(s.length() >= temp){ 
                break;
            }
        }  
        return s.charAt(temp-1) - '0';
    }
 
}