  class Computer
    {
        public void playMusic()
        {
            System.out.println("music playing.....");
        }
        public String getMeABat(int cost)
        {
            if(cost >= 500)
            return "bat";
            else
              return "ball";
        }
    }
    
    public class Method1 
    {
        public static void main(String[] args) 
        {
            Computer obj = new Computer();
            obj.playMusic();
            String str = obj.getMeABat(300);
            System.out.println(str);
        }
    }
    
