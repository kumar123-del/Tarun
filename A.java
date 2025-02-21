public class A 
{
    public static void main(String[] args) 
    {
        int obj[][][] = new int[3][4][5];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            // {
            //     obj [i][j] = (int)(Math.random()*10);
            // }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(obj[i][j] + " ");
            }
            System.out.println();
        }

    }
}
