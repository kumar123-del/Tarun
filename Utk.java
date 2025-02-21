// default vs parameterized constructor
class Human
{
    String name;
    int age;

    public Human()
    {
        name = "tarun";
        age = 22;
    }
    public Human(String n,int a)
    {
      this.name = n;
      this.age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
public class Utk 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        Human obj1 = new Human("tarun",21);
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}

