import java.util.Scanner;
class Table
{

public static void main(String args[])

{
 String st;
 do
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Number");
 int no = sc.nextInt();
 for(int i = 1 ; i<=10 ; i++)
 {
   System.out.println(no + "x" + i + "=" + (no*i));
 }
System.out.println("Do you want to Continue??? Press Y FOR yes and N For no");
st=sc.next();
}

while(st.equals("Y")||st.equals("y"));


}









}