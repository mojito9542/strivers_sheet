public class sorted_array_intersect {
    public static void main(String[] args) {
        int a[] = { 1,2,4,5,6};
        int b[] = { 2,5,8};
        intersect(a, b);
    }

    static void intersect(int[] a, int[] b)
    {
        int inters[] = new int[Integer.min(a.length, b.length)];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j]){
            inters[k++]=a[i];
            i++;
            j++;
            }
            else if(a[i]<b[j]) i++;

            else j++;
        }

        System.out.println("Intersected array: \n");
        for (i = 0;i<k;i++) {
          System.out.println(inters[i] + " ");  
        }
    }

}
