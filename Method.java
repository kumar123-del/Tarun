class Computer
{
    public void playMusic()
    {
        System.out.println("music playing.....");
    }
    public String getMeABat(int cost)
    {
        return "bat";
    }
}

public class Method 
{
    public static void main(String[] args) 
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeABat(300);
        System.out.println(str);
    }
}
