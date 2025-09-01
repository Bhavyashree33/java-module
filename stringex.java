import java.util.*;
public class stringex{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first string:");
        String s1= sc.nextLine();
        System.out.println("enter the first string:");
        String s2= sc.nextLine();
        s1 = s1.toUpperCase();
        s2 = s2.toLowerCase();
        if(s1.equals(s2)){
            System.out.println("both the strings are equal");
        }
        else{
            System.out.println("they are not equal");
        }

    }
}