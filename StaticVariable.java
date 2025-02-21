class Mobile
{
    String brand; //instace variable
    int price;    // instance variable
    static String name; // static variable
    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class StaticVariable 
{
    public static void main(String[] args) 
    {
        Mobile obj = new Mobile();
        obj.brand = " vivo ";
        obj.price = 18000;
        Mobile.name = "phone";

        Mobile obj1 = new Mobile(); 
        obj1.brand = " realme ";
        obj1.price = 15000;
        Mobile.name = "phone";
        Mobile.name = "smart phone";
        obj.show();
        obj1.show();

    }
}
