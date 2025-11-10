
public class operatorprecedence {
    public static void main(String[] args) {                            //mixedoperators
        int a=4,b=2,c=7;
        int result=++a*(b--+~c)-(-b);//5*(-6)-(-1)
        System.out.println("Result:"+result);
    }
}