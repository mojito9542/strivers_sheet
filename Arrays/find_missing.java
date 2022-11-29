public class find_missing {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9};
        int arr2[] = { 1,2,3,4,5,6,7,8,9,11};

        findMissing(arr,9);
        findMissing(arr2,11);
    }

    private static void findMissing(int[] arr, int i) {
    
        int sum = (i*(i+1))/2;
        int sumarr = 0;
        for (int j : arr) {
            sumarr+=j;
        }
        System.out.println("Missing number: "+ (sum - sumarr));
    
    }
}
