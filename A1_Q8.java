import java.util.*;
public class A_1_8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter number of times you want to rotate");
        int k=sc.nextInt();
        int b=n;
        int d=0;
        int r=0;
        while(b>0)
        {
           d++;
           b=b/10;
        }
        int p=Math.abs(k);
        if(k>0)
        {
        
        //System.out.println(d);
        int h=n%((int)(Math.pow(10,k)));
        int l=n/((int)(Math.pow(10,k)));
        //System.out.println(h);
        //System.out.println(l);
        r=(h*(int)Math.pow(10,(d-k)))+l;
        System.out.println("Rotated number= "+r);
    }
    else
    {
        int h=n/((int)(Math.pow(10,d-p)));
        int l=n%((int)(Math.pow(10,d-p)));
        System.out.println(h);
        System.out.println(l);
        r=(l*(int)Math.pow(10,(p)))+h;
        System.out.println("Rotated number= "+r);
    }
}
}
