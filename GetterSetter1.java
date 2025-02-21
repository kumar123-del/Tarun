class Human
{
private String name;
private int age;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}


}
public class GetterSetter1 
{
    public static void main(String a[])
    {
        Human obj = new Human();
        obj.setName("kumar");
        obj.setAge(21);
        System.out.println(obj.getName() + " : "  + obj.getAge());
    }
}
