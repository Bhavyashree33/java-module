import java.util.*;

class ternarypos{
    public static void main(String[] args) {
        Scanner m= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=m.nextInt();
        String result=(num>0)?"Positive":(num<0)?"Negative":"Zero";
        System.out.println("The number " +num+ " is "+result);

    }
}