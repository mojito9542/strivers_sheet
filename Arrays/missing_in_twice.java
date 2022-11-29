public class missing_in_twice {
    public static void search(int[] arr, int low, int high)
    {
        if (low > high)
            return;
        if (low == high) {
            System.out.println("The required element is "
                               + arr[low]);
            return;
        }

        int mid = (low + high) / 2;

        if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])
        {
            System.out.println("The required element is "
                               + arr[mid]);
            return;
        }


        if (mid % 2 == 0) {
            if (arr[mid] == arr[mid + 1])
                search(arr, mid + 2, high);
            else
                search(arr, low, mid);
        }
        // If mid is odd
        else if (mid % 2 == 1) {
            if (arr[mid] == arr[mid - 1])
                search(arr, mid + 1, high);
            else
                search(arr, low, mid - 1);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 1, 1, 2,2, 4, 4, 5, 5, 6 };
        search(arr, 0, arr.length - 1);
    }
}    
