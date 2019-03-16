package After;

public class Addition_OpenClosedPrinciple {

    interface calc
    {
        int values(int a, int b);
    }

    class addition implements calc
    {
        public int values(int a, int b)
        {
            return a+b;
        }
    }
}
