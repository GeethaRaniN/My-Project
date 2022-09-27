	import java.io.*;
	import java.util.*;
	 
	public class Diceroll{
	 
	static void dicesSum(int n)
	{
	     
	    // Store the probabilities
	    double[][] dp = new double[n + 1][6 * n + 1];
	 
	    // Precompute the probabilities
	    // for values possible using 1 dice
	    for(int i = 1; i <= 6; i++)
	        dp[1][i] = 1 / 6.0;
	 
	    // Compute the probabilities
	    // for all values from 2 to N
	    for(int i = 2; i <= n; i++)
	        for(int j = i - 1; j <= 6 * (i - 1); j++)
	            for(int k = 1; k <= 6; k++)
	            {
	                dp[i][j + k] += (dp[i - 1][j] *
	                                 dp[1][k]);
	            }
	 
	    // Print the result
	    for(int i = n; i <= 6 * n; i++)
	    {
	        System.out.println(i + " " +
	                           Math.round(dp[n][i] * 1000.0) /
	                                                 1000.0);
	    }
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    int n = 2;
	     
	    dicesSum(n);
	}
	}