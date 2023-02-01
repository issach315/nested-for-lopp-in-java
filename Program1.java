package nestedForLoop.Day1;
import java.util.Scanner;
public class Program1 
{
    
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter hoe mant rows you want to print ");
        
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    /*  int i=1 i<=5 condition :true
            
            int j=1 ; j<=5 condition :true
                
                * * * * *
                
        int i=2 i<=5 condition :true
        
             int j=2 ; j<=5 condition :true
                 * * * * *
             
        int i=3 i<=5 condition :true
            
             int j=3 ; j<=5 condition :true
                 * * * * *
             
             
        int i=4 i<=5 condition :true
        
             int j=4 ; j<=5 condition :true
                 * * * * *
             
        int i=5 i<=5 condition :true
            
             int j=5 ; j<=5 condition :true
                  * * * * *
             
             
        int i=6 i<=5 condition :false
     
     */
    
        
    }
}
