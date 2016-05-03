import java.math.BigInteger;
import java.util.Scanner;


public class practise_binomial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int ans=solution(n,k);
		System.out.print(ans);
		
	}

	private static int solution(int n, int k) {
		// TODO Auto-generated method stub
		if(n<k)
			return -1;
		BigInteger limit;
		if(k>n-k)
		{
			limit = fact1(n,n-k).divide(fact2(n-k));
		}
		else
			limit = fact1(n,k).divide(fact2(k));
		
		if(limit.compareTo(BigInteger.valueOf(1000000000))==1)
			return -1;
		else
			return limit.intValue();
	}

	private static BigInteger fact2(int n) {
		// TODO Auto-generated method stub
		BigInteger result = BigInteger.ONE;
	       for (int i = 1; i <= n; i++) {
	           result = result.multiply(BigInteger.valueOf(i));
	       }
		return result;
	}

	private static BigInteger fact1(int n, int k) {
		// TODO Auto-generated method stub
		BigInteger result = BigInteger.ONE;
	       while(k>0) {
	           result = result.multiply(BigInteger.valueOf(n));
	           n--;
	           k--;
	       }
		return result;
	}

}
