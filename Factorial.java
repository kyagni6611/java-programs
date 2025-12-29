import java.util.Scanner; 
class Factorial{
    public static void main(String[] args) {
    Scanner  sn =new Scanner(System.in);
    int n=sn.nextInt();
    int Fact=1;
    for(int i=1;i<=n;i++)
    {
        Fact=Fact*i;
    }
    System.out.println("Factorial:"+Fact);
    sn.close();
    }

}