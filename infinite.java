import java.util.*;
public class infinite {
    public static void main(String args[])
    {
        System.out.println("enter the limit upto which u want to print even number.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            
        }
        
    }
    
}
