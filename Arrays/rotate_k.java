// using reversal technique for rotating. 

// steps for left rotate:
// 1. Reverse first k elements
// 2. Reverse last n-k elements
// 3. Reverse whole array

// steps for right rotate: 
// 1. Reverse last k elements
// 2. Reverse first n-k elements
// 3. Reverse whole array
class rotate_k {
public static void main(String args[]) {
    int[] arr1 = {1,2,3,4,5,6,7};
    int[] arr2 = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 3;
    RotateLeft(arr1, n, k);
    System.out.print("After Rotating " + k + " elements to left ");
    for (int i = 0; i < n; i++)
      System.out.print(arr1[i] + " ");
    System.out.println();
    RotateRight(arr2, n, k);
    System.out.print("After Rotating " + k + " elements to left ");
    for (int i = 0; i < n; i++)
      System.out.print(arr2[i] + " ");
    System.out.println();
  }

static void RotateRight(int[] arr, int n, int k) {
reverse(arr,n-k,n-1);
reverse(arr,0,n-k-1);
reverse(arr,0,n-1);
}

static void RotateLeft(int[] arr, int n, int k) {
reverse(arr,0,k-1);
reverse(arr,k,n-1);
reverse(arr,0,n-1);
}

private static void reverse(int[] arr, int i, int j) {
    while(i<=j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}

  


}




