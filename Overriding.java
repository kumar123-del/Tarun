class Calc
{
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
}
class AdvCalc extends Calc
{
    public int add(int n1,int n2)
    {
        return n1 + n2 +1;
    }
}
public class Overriding 
{
   public static void main(String[] args) 
   {
    AdvCalc obj = new AdvCalc();
    int r = obj.add(2, 50);
    System.out.println(r);
   } 
}
