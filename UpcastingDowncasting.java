class A
{
  public void show1()
  {
    System.out.println("in a show");
  }
}
class B extends A
{
    public void show2()
  {
    System.out.println("in b show");
  }
}
public class UpcastingDowncasting 
{
    public static void main(String[] args) 
    {
       A obj = (A) new B();  // upcasting
       obj.show1(); 

      B obj1 = (B) obj;  // downcasting
       obj1.show2();
    }
}
