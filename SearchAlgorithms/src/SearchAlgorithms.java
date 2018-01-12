
public class SearchAlgorithms {

	public static void main(String[] args)
	{
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2 = {0,4,5,6,12,15,17,23,29};
		
		System.out.println(binSearch(test1,3));//2
		System.out.println(linSearch(test1,3));//2
		
		System.out.println(binSearch(test2,23)); //7
		System.out.println(linSearch(test2,23)); //7
		
		System.out.println(binSearch(test2,25)); //-1
		System.out.println(linSearch(test2,25)); //-1
	
		System.out.println(binSearch(test1,10)); //9
		System.out.println(linSearch(test1,1)); //0
		
		System.out.println(binSearch(test1, 1)); //0
		
	}
	private static int linSearch(int []a, int query)
	{
		for (int i=0; i < a.length; i++)
		{ 
			if (a[i]== query) 
			{
				return i;
			}
		}
		return -1;
	}
	
	private static int binSearch( int[] a, int query)
	{
		int l = 0;
		int r = a.length;
		while (l<= r)
		{ 
			int mid = l+(r-l)/2;
			if (a[mid]==query)
			{
				return (mid);
			}
			else if (query <a[mid])
			{
				return l+1;
			}
			else if (query >a[mid])
			{
				return r-1;
			}
		}
			return -1;
		 }
		}
	}
}