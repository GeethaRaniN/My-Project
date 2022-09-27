import java.io.*;
	import java.util.*;
	
public class Rain {
	     
	// Function to find
	// the probability
	static float rainDayProbability(int a[],
	                                int n)
	{
	    float count = 0, m;
	 
	    // count 1
	    for (int i = 0; i < n; i++)
	    {
	        if (a[i] == 1)
	            count++;
	    }
	 
	    // find probability
	    m = count / n;
	    return m;
	}
	 
	// Driver Code
	public static void main(String args[])
	{
	    int a[] = { 1, 0, 1, 0, 1, 1, 1, 1 };
	    int n = a.length;
	 
	    System.out.print(rainDayProbability(a, n));
	}
	}