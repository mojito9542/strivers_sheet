class subarr_sum {
    public static void subArrSum(int[] a, int n, int k) {
        int start = 0, end = -1, sum = 0;
        while (start < n) {
          while ((end + 1 < n) && (sum + a[end + 1] <= k))
            sum += a[++end];
    
          if (sum == k) {
            for (int p = start; p <= end; p++)
              System.out.print(a[p] + " ");
            System.out.println();
          }
    
          sum -= a[start];
          start++;
        }
      }
    
    }


