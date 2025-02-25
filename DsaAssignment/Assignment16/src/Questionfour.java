import java.io.*;
import java.util.*;

class questionfour
{
	static Queue<Integer> q =
					new LinkedList<Integer>();
	
	
	static boolean checkSorted(int n)
	{
		Stack<Integer> st =
					new Stack<Integer>();
		int expected = 1;
		int fnt;
	
		
		while (q.size() != 0)
		{
			fnt = q.peek();
			q.poll();
	
			// if front element is
			// the expected element
			if (fnt == expected)
				expected++;
	
			else
			{
				// if stack is empty,
				// push the element
				if (st.size() == 0)
				{
					st.push(fnt);
				}
	
				
				else if (st.size() != 0 &&
						st.peek() < fnt)
				{
					return false;
				}
	
				// else push into the stack.
				else
					st.push(fnt);
			}
	
			
			while (st.size() != 0 &&
				st.peek() == expected)
			{
				st.pop();
				expected++;
			}
		}
		
		if (expected - 1 == n &&
				st.size() == 0)
			return true;
	
		return false;
	}
		public static void main(String args[])
	{
		q.add(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
	
		int n = q.size();

		if (checkSorted(n))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}


