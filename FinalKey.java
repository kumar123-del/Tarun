
 class Computer // final class Computer (this is final class)
{
    public void show() // public final void show()    (mention final this is final method)
    {
        System.out.println("coading");
    }
    public void  add(int a , int b)
    {
        System.out.println(a+b);
    }
}
class Laptop extends Computer
{
    public void show()
    {
        System.out.println(" my coading");
    } 
}
public class FinalKey 
{
    public static void main(String[] args) 
    {
        Laptop obj = new Laptop();
        obj.show();
        obj.add(5, 02);
    }
}
