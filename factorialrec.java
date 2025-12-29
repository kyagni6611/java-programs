
import java.util.Scanner;

public class factorialrec{
    public static int fact(int n){
        if(n==0||n==1)
        return 1;
    return n*fact(n-1);


    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        System.out.println("fact="+fact(n));
        sn.close();
    }
}
    

