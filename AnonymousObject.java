class A
{
public A()
{
    System.out.println("object created");
}
public void show()
{
    System.out.println("in a show");
}
}
public class AnonymousObject 
{
    public static void main(String[] args) 
    {
       // new A();
       new A().show();
    }
}
