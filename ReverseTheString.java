 import java.util.Scanner;
public class ReverseTheString
{

public static void main(String args[])


{


Scanner sc = new Scanner(System.in);
System.out.println("Enter the String that you want to reverse");
String str = sc.next();
int length = str.length();
String strNew = " ";
for(int i = length-1 ; i>=0 ; i--)
{

strNew = strNew + str.charAt(i);

}


System.out.println("Reverse is" +strNew);

}











}