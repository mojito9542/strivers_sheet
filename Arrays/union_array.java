import org.w3c.dom.ls.LSParserFilter;

public class union_array {
    static void union(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
        int un[] = new int[m+n];
        int i=0, j=0, k=0;

        while(i<n && j<m)
        {
            if(arr1[i]<=arr2[j])
            {
                if(k==0)
                un[k++] = arr1[i];
                else if(un[k-1]!=arr1[i])
                    un[k++] = arr1[i];
                i++;
            }
            else
            {
                if(k==0)
                un[k++] = arr2[j];
                else if (un[k-1]!=arr2[j])
                un[k++] = arr2[j];
                j++;
            }
        }
        while(i<n)
        if(un[k]!=arr1[i])
        un[k++]=arr1[i++];

        while(j<m)
        if(un[k]!=arr2[j])
        un[k++]=arr2[j++];

        System.out.println("Union of arrays: ");

        for (int k2 = 0; k2 < k; k2++) {
            
            System.out.println(un[k2] + " ");
        }
        }
        
    public static void main(String[] args) {
        
        int arr1[] = {1, 2, 3, 6, 7, 8, 9, 10,13,16};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        union(arr1, arr2);
    }
}
