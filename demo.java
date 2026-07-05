import java.util.Scanner;

class demo{
    
    static void f(int i,int n )
    {
        if(i>=n)
            return;
        System.out.println(i);
        f(i+1,n);
    }

    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f(0,n);

        sc.close();
    }

}