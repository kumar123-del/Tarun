public class Switch 
{
    public static void main(String[] args) 
    {
        int x = 41;
        
        switch (x)
         {
            case 1:
            {
                System.out.println("sunday");
            }
                 break;
             case 2:
             {
                System.out.println("monday");
             }  
             break;
             case 3:
             {
                 System.out.println("tuesday");
             }
                  break;
              case 4:
              {
                 System.out.println("wendsday");
              }  
              break; 
              case 5:
              {
                  System.out.println("thursday");
              }
                   break;
               case 6:
               {
                  System.out.println("friday");
               }  
               break; 
        
            default:
            {
                System.out.println("saturday");
            }
                break;
        }
    }
}
