import java.util.*;
public class A_1_9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int g=0;
        int l=0;
        for(int i=1;i<=(Math.min(a,b));i++)
        {
            if(a%i == 0 && b%i == 0)
            {
                g=i;
            }
        }
        l=(a*b)/g;
        System.out.println("Greatest Common Divisor= "+g);
        System.out.println("Lowest Common Multiple= "+l);
    }
}
