class Cricketer
{
    String name;
    int jerseyno;
    int age;
}
public class EnchancedForLoop 
{
    public static void main(String[] args) 
    {
      Cricketer c1 = new Cricketer();
      c1.name = "virat kohli";
      c1.jerseyno = 18;
      c1.age = 36;
      
      Cricketer c2 = new Cricketer();
      c2.name = "bhuvi";
      c2.jerseyno = 15;
      c2.age = 35;

      Cricketer c3 = new Cricketer();
      c3.name = "abd";
      c3.jerseyno = 17;
      c3.age = 37;
      Cricketer Cricketers[] = new Cricketer[3];
      Cricketers[0] = c1;
      Cricketers[1] = c2;
      Cricketers[2] = c3;
      for(Cricketer ctr : Cricketers)
      { 
        System.out.println(ctr.name + " : " + ctr.jerseyno + " : " + ctr.age);
      }

    }
}
