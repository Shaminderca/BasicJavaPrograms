class Test
{
int i;
void setValues(int x)
{
x=i;
}
void show()
{
System.out.println(i);
}
}
class Xyz
{

public static void main(String args[])

{
Test t = new Test();
t.setValues(10);
t.show();

}


}