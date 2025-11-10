public class CONTINUE {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i==6){
                System.out.println("SKipping:"+i);
                continue;
            }
            System.out.println("i:"+i);
        }
    }
}