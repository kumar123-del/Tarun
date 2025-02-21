class A
{
    public void show()
    {
        System.out.println("a");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("b");
    }
}
class C extends B
{
    public void show()
    {
        System.out.println("c");
    }
}

public class Polymoephism 
{
   public static void main(String[] args) 
   {
    A obj = new A();
    obj.show();
    obj = new B();
    obj.show();
    obj = new C();
    obj.show();

   } 
}
