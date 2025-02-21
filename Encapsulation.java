class Human
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }
}
public class Encapsulation 
{
    public static void main(String[] args) 
    {
       Human obj = new Human();
       obj.setName("tarun kumar");
       obj.setAge(21);
       System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
