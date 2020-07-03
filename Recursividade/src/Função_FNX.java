public class Função_FNX {

    public static void main(String[] args) {
        System.out.print(func(2, -2));
    }

    public static double func(double p, double n)	{
        if(n == 0)
            return 1;

        else if(n == 1)
            return p;

        else if((n % 2) == 0 && n > 0)	{
            return func(p, n/2) * func(p, n/2);
        }

        else if((n % 2) != 0 && n > 0)	{
            return func(p, n-1) * p;
        }

        else if(n < 0)	{
            return (1/func(p,n * -1));
        }

        else	{
            return 0;
        }
    }
}