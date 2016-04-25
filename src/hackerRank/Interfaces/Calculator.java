package hackerRank.Interfaces;

class Calculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum = 0;
		int i = 1;
		for (; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				sum += i + n / i;
		i--;
		if (i * i == n)
			return sum -= n / i;
		else
			return sum;
	}
}
