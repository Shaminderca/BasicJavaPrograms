class ThisDemo
{
ThisDemo()
{
this(10);
System.out.println("No Argument Constructor");
}
ThisDemo(int a);
{
System.out.println("Parameterised Constructor");
}
public static void main(String[] args)
{
ThisDemo td = new ThisDemo(10);

}

}