import java.util.Scanner;
class InputFromUser
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the UserName");
String name = sc.next();
System.out.println("Enter the Gender");
char gender = sc.next().charAt(0);
System.out.println("Enter the Age");
int age = sc.nextInt();
System.out.println("Enter the PhoneNumber");
long phoneNo = sc.nextLong();

System.out.println(name);
System.out.println(gender);
System.out.println(age);
System.out.println(phoneNo);

}






}