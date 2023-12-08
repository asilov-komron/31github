class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] final_array = new int[ m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if (nums1[i] < nums2[j]){
                final_array[k] = nums1[i];
                i++;
                
                 
            }

            else{
                final_array[k] = nums2[j];
                j++;
                
            }
            k++;
        }

         while(i < m){
           
                final_array[k] = nums1[i];
                i++;
                k++;
            
        }

         while(j < n){
            
                final_array[k] = nums2[j];
                j++;
                k++;
                 
        
        }

        for (i = 0; i < m + n; i++){
            nums1[i] = final_array[i];
        }

    }
}


