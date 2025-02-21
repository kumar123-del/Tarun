class Mobile
{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    } 
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }


}

public class StaticMethod 
{
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.price = 1500;
        Mobile.name = "smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "samsung";
        obj2.price = 1700;
        Mobile.name ="smart phone";

        Mobile.name = "phone";
        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
        Mobile.show1(obj2);
    }
}
