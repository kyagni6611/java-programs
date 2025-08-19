import java.util.Scanner;
class Marks
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>=25)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	sc.close();
}
}