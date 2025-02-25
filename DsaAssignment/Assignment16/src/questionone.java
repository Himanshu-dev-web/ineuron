

	
import java.util.*;

class questionone {

	static void NFG(int a[], int n, int freq[])
	{

		// stack data structure to store the position
		// of array element
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);

		// res to store the value of next greater
		// frequency element for each element
		int res[] = new int[n];
		for (int i = 0; i < n; i++)
			res[i] = 0;

		for (int i = 1; i < n; i++)
		{
		

			if (freq[a[s.peek()]] > freq[a[i]])
				s.push(i);
			else
			{
			

				while (freq[a[s.peek()]] < freq[a[i]]
					&& s.size() > 0)
				{
					res[s.peek()] = a[i];
					s.pop();
				}

				// now push the current element
				s.push(i);
			}
		}

		while (s.size() > 0)
		{
			res[s.peek()] = -1;
			s.pop();
		}

		for (int i = 0; i < n; i++)
		{
			
			System.out.print(res[i] + " ");
		}
	}

	// Driver code
	public static void main(String args[])
	{

		int a[] = { 1, 1, 2, 3, 4, 2, 1 };
		int len = 7;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++)
		{
			// Getting the max element of the array
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		int freq[] = new int[max + 1];

		for (int i = 0; i < max + 1; i++)
			freq[i] = 0;

		// Calculating frequency of each element
		for (int i = 0; i < len; i++)
		{
			freq[a[i]]++;
		}
		// Function call
		NFG(a, len, freq);
	}
}

