import java.util.Scanner;
class Reverse
{
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number");
  int No  = sc.nextInt();
  int rem;
  int rev = 0;
  while(No != 0)
  {
     rem = No%10;
     rev = rev*10 + rem;
     No = No/10;

  }
   System.out.println("Revese is" + rev);
  }
}
