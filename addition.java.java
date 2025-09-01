import java.util.Scanner;

public class addition {
    
    public static void main( String[] args){
        Scanner alpha = new Scanner( System.in);
        System.out.println( "enter the two numbers");
        int a = alpha.nextInt();
        int b = alpha.nextInt();
        int c = a+b;
        System.out.println("addition is "+c);

    }
    
}
