public class is_sorted {
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 2, 10, 4};
        int arr3[] = { 10,9,8,7};
    
        System.out.println(isSorted(arr, arr.length));
        System.out.println(isSorted(arr2, arr2.length));
        System.out.println(isSorted(arr3, arr3.length));
      }

      static boolean isSorted(int arr[], int n) {
        int i;
        for (i = 1; i < n; i++) {
          if (arr[i] < arr[i - 1])
            break;
        }
        if (i!= n)
        {
            for (i = 1; i < n; i++) {
                if (arr[i] > arr[i - 1])
                  break;
        }
      }
      return i==n?true:false;
    }

}
