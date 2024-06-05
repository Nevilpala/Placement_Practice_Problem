import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 2 <=");
        System.out.println();

        
        // System.out.print("Size n : ");
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // System.out.println();
        // for (int i = 0; i < n; i++) {
        //     System.out.print("array[" + (i) + "] : ");
        //     arr[i] = sc.nextInt();
        // }
        

        // System.out.println("\nAns : " + jumpLength(arr, n));
        System.out.println("1 for Minstack"); 
        System.out.println("2 for push"); 
        System.out.println("3 for pop"); 
        System.out.println("4 for top"); 
        System.out.println("5 for getMin"); 

        System.out.print("\nEnter Operaton with comma seprated : "); 
        String[] word = sc.nextLine().split(",");

        System.out.print("Enter Value with comma seprated : "); 
        String[] val = sc.nextLine().split(",");
        
    
        if(word.length == val.length){
            MinStack minStack = new MinStack();
            List<String> st= new ArrayList<>();
            String[] st = new String[word.length];
            for(int i = 0;i<word.length;i++){
                String ans = "";
                switch (word[i]) {
                    case "1":
                        minStack = new MinStack();
                        break;
                    case "2":
                        minStack.push(Integer.parseInt(val[i]));
                        st.push(null);
                        break;
                    case "3":
                        minStack.pop(Integer.parseInt(val[i]));

                        break;
                    case "4":
                        minStack = new MinStack();
                        break;
                    case "5":
                        minStack = new MinStack();
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
class MinStack{
    int arr[] = new int[100],top=-1;
    public void push(int val){
        top++;
        if(top>arr.length){
            System.out.println("Stack Overflow");
            return;
        }
        arr[top]=val;
    }

    public int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return -1;
        }
        int val = arr[top];
        return val;

    }

    public int minimum(){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }
}
