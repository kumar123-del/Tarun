public class StringBuffer1 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("tarun");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // sb.append("kumar");
         
        // sb.deleteCharAt(3);
        
        //sb.insert(0,"ulisi");
        // sb.setLength(30);
         sb.ensureCapacity(100);
        System.out.println(sb);

    }
}
