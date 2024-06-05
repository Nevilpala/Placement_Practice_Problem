import java.util.*;
public class Test1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=> Program - 1 <=");
        System.out.println();

        String haystack = "";
        String needle = "";

        // Example
        // haystack = "sadbutsad";
        // needle = "sad";

        System.out.print("Haystack : ");
        haystack = sc.nextLine();

        System.out.print("Needle : ");
        needle = sc.nextLine();

        int ans = haystack.indexOf(needle);
        System.out.println(ans);

    }
}