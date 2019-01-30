public class Fibonacci
{
    public int fibonacci(int n, String type)
    {
        int finalResult;
        if (type == "recursive")
        {
            finalResult = fibRecursive(n);
            return finalResult;
        }

        else if (type == "iterative")
        {
            finalResult = fibIterative(n);
            return finalResult;
        }
        return -1;
    }

    public int fibRecursive(int val)
    {
        int recResult;
        if (val == 1 || val == 0)
        {
            return val;
        }
        recResult = fibRecursive(val - 1) + fibRecursive(val - 2);
        return recResult;
    }

    public int fibIterative(int val)
    {
        int iteResult = 0;
        int val1 = 0;
        int val2 = 1;

        for (int i = 1; i <= val; i++)
        {
            val1 += val2;
            val2 = val1 - val2;
        }
        iteResult = val1;
        return iteResult;
    }

}
