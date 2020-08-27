class Swap
{
public static void main(String args[])
{

int a =10, b=20;

System.out.println("Before swaping" + "a =" a + "b =" + b); 

a = a+b;  // 10 + 20 = 30
b = a-b;  // 30-20 = 10
a =  a-b; 

System.out.println("Afetr swaping" + "a =" a + "b = " + b);


}



}