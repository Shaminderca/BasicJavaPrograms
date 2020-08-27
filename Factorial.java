import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int Fac=1;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number");
int no = sc.nextInt();
for(int i = no ; i>0 ; i--)
{


Fac = Fac*i;

}

System.out.println("Factorial of" + no + "is " + Fac);

}




}