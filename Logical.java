public class Logical 
{
    public static void main(String[] args) 
    {
     int a = 4;
     int b = 6;
     int x = 5;
     int y = 7;
     //boolean result = x > y && a > b;
     boolean result = x > y || a  < b   || a >1 ;
     System.out.println(result);
     System.out.println(!result);

    }
}
