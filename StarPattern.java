import java.util.*;
class StarPattern{
    public static void main(String args[])
    {
        int n;
        System.out.println("enter the n value:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=n-1,g=1;
        int flag=0;
        int count=0;
        for(int i=1;i<(2*n);i++)
        {
            //for printing first white spaces:
            if(flag==0)
            {
            for(int j=0;j<m;j++)
            {
                System.out.print(" ");
            }
            //for printing the *;
            for(int j=1;j<(2*g);j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<m;j++)
            {
                System.out.print(" ");
            }
            m--;
            g++;
            }
            else
            {
                //for printing the white spaces:
                for(int j=0;j<m;j++)
                {
                    System.out.print(" ");
                }
                //for printing the *;

                for(int j=1;j<(2*g);j++)
                {
                    System.out.print("*");
                }
                for(int j=0;j<m;j++)
                {
                    System.out.print(" ");
                }
                g--;
                m++;
            }
            count++;
            if(count==n)
            {
                flag=1;
                m=1;
                g=n-1;
            }
            System.out.println();
        }
    }
}