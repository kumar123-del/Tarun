class Calculater
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1,int n2)
    {
        return n1+n2;
    }

}

public class MethodOverLoading 
{
    public static void main(String[] args) 
    {
        Calculater obj = new Calculater();
        int r1 = obj.add(4, 05);
        System.out.println(r1);
    }
}
