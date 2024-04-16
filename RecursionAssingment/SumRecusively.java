package RecursionAssingment;

import java.util.*;


public class SumRecusively
{   static int func(int n)
{
    if (n == 0)
    return 0;
    return (n % 10 + func(n / 10));
}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int ans = func(n);
		System.out.println(" Sum of digits in " + n
       + " is " + ans );
	}
}