class Mobile
{
    String brand;
    int price;
    Static String name;

    public mobile()
    {
        brand = " ";
        price = 200;
        System.out.println("in constructor");
    }
    Static
    {
        name = "phone";
        System.out.println("in static block");
    }
    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

}
public class StaticBlock 
{
    public static void main(String[] args) 
    {
        class.ForName("mobile");
    }
}
