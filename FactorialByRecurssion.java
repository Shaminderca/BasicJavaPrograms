import java.util.Scanner;
class FactorialByRecursion
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int no = s.nextInt();
int fact;
FactorialByRecursion ob = new FactorialByRecursion();
fact= ob.calcFact(no);
System.out.println("Factorial of no" + no + "is" + fact);


}

public int calcFact(int no)
{

if(no>=1)
{

return (no*calcFact(no-1));

}
return 1;

}

}