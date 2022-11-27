public class sec_small_sec_large {

    public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 6, 7, 5};
	getElements(arr, arr.length);
    int[] arr2 = {5,18,20,23,03, 56};
    getElements(arr2, arr2.length);
}
static private void getElements(int[] arr, int n)
{
if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	for (int i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}

        if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }

	}

	System.out.println("Second smallest is "+second_small);
	System.out.println("Second largest is "+second_large);
}

}
