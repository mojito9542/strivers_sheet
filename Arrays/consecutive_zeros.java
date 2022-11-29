public class consecutive_zeros {

    static void findMaxCons(int[] arr, int n, int m)
    {
        int sum = 0,j=0;
        int arrj[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0){
            arrj[j++]= sum+1;
            sum =0;
            }
            else sum++;
        }
        arrj[j-1]+=sum;
        sum = 0; 
        int zeros = 0, max =0, p=0;
        for (int i = 0; i < j; i++) {
                sum+=arrj[i];
                zeros++;
                if(zeros == m)
                {
                    if(max<sum)
                    max = sum;
                    sum-=arrj[p];
                    p++;
                    zeros --;
                } 
            }

            if(sum>max)
            max = sum; 
            System.out.println(max);
        }

        public static void main(String[] args) {
            int arr1[] = {1,0,1};
            int arr2[] = {1,0,0,1,1,0,1,0,1,1,1};
            findMaxCons(arr2, 11, 2);
            findMaxCons(arr1, 3, 1);
        
        }

    }
