
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int fib = fib(4);
		System.out.println(fib);
		int fib2 = fib2(4);
		System.out.println(fib2);
	}
	public static int fib(int n) 
	{
		
		if (n == 0)
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		
		return fib(n-1) + fib(n-2);
	}
	public static int fib2(int n) 
	{
		
		if (n == 0)
		{
			return 0;
		}
		else if (n <= 2)
		{
			return 1;
		}
		
		int sum = 0;
		int prev1 = 1;
		int prev2 = 1;
		int index = 2;
		while (index < n)
		{
			sum = prev1 + prev2;
			prev2 = prev1;
			prev1 = sum;
			index++;
		}
		return sum;
	}
}
