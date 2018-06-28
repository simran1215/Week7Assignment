
public class GCD {
	
	public static int findGCD(int num1, int num2) throws RuntimeException
	{
		return findGCDHelper(num1, num2, 0);
	}
	
	public static int findGCDHelper(int num1, int num2, int depth) throws RuntimeException
	{
		if(num1 == num2)
		{
			if(num1 != 1)
			{
				return num1;
			}
			else
			{
				if(depth == 0)
				{
					throw new RuntimeException("GCD is 1");
				}
				else
				{
					return 1;
				}
			}
		}
		
		// 5%3 == 2
		if(num2%num1 == 0)
		{
			return num1;
		}
		if(num1%num2 == 0)
		{
			return num2;
		}
		//  18 27
		// both divisible by 3
		// divide largest one by 3
		// 18 9
		// num1%num2 == 0
		// return num2 (9), the gcd
		
		// 124 44
		// 31 11
		int divideby = 2;
		while(divideby < num1 && divideby < num2)
		{
			if(num1%divideby == 0 && num2%divideby == 0)
			{
				num1 = num1/divideby;
				num2 = num2/divideby;
				return divideby*findGCDHelper(num1, num2, depth+1); //return the gcd of the smaller numbers
			}
			divideby++;
		}
		if(depth == 0)
		{
			throw new RuntimeException("GCD is 1");
		}
		else
		{
			return 1;
		}
		//       48 18 (is divisible by 2?  yes)
		// 2*     24 9 (divisible by 2?  no.  by 3? yes)
		// 3*     8 3 (divisible by anything?  no.  gcd 1)
		// 1
	}
}
