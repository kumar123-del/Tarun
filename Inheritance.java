class Animal
{
    String name;
    public void eat()
    {
        System.out.println("i can eat");
    }
}
class dog extends Animal
{
    public void display()
    {
        System.out.println("my name is " + name);
    }
}
public class Inheritance 
{
  public static void main(String[] args) 
  {
    dog labrador = new dog();
    labrador.name = "blacky";
    labrador.display();
    labrador.eat();
  }  
}
