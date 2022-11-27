class array_larget
{
    public static void main(String[] args) {
        
        int a1[] =  {2,5,1,3,0,9,12};
        System.out.println("The Largest element in the array is: "+findElement(a1));
     
        int a2[] =  {12,23,02,8,10,5,7,9};
        System.out.println("The Largest element in the array is: "+findElement(a2));
      }
      static int findElement(int arr[]) {
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] > max) {
            max= arr[i];
          }
        }
        return max;


    }
}