public class Factorial
{

    public int factorial(int n, String type)
    {
        int finalResult;
        if (type == "recursive")
        {
            finalResult = factorialRecursive(n);
            return finalResult;
        }

        else if (type == "iterative")
        {
            finalResult = factorialIterative(n);
            return finalResult;
        }
        return -1;
    }

    public int factorialRecursive(int val)
    {
        int recResult = 1;
        if (val == 1)
        {
            return 1;
        }
        recResult = factorialRecursive(val - 1) * val;
        return recResult;

    }

    public int factorialIterative(int val)
    {
        int iteResult = 1;
        for (int i = val; i > 0; i--)
        {
            iteResult *= i;
        }
        return iteResult;
    }
}
