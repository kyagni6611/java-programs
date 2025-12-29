
import java.util.Scanner;


public class fabanacci {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a=sn.nextInt();
        int b=sn.nextInt();
        for (int i = 0; i<n; i++)  
        {
              System.out.println(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        sn.close();
        }
}