public class Ackerman {
    public static void main(String[] args) {
        System.out.print(Acker(1,2));
    }

    public static int Acker(int m, int n)   {
        if(m > 0 && n == 0)    {
           return Acker(n-1, 1);
        }

        else if(m > 0 && n > 0) {
            return Acker(m-1, Acker(m, n-1));
        }

        else    {
            return n + 1;
        }
    }
}
