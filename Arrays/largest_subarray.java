class largest_subarray{
    public static void main(String[] args) {
        int[] arr = {7,1,6,0};
        int n = arr.length, k = 7;
    
        System.out.println("Length of the longest subarray with sum K is " + 
        subarray_sum(arr, n, k));
      }
    
      public static int subarray_sum(int[] arr, int n, int k) {
        int start = 0, end = -1, sum = 0, max = 0;
        while (start < n) {
          while ((end + 1 < n) && (sum + arr[end + 1] <= k))
            sum += arr[++end];
    
          if (sum == k)
            max = Math.max(max, (end - start + 1));
    
          sum -= arr[start];
          start++;
        }
        return max;
      }
    
    }
