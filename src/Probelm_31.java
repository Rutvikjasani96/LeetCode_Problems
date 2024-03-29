public class Probelm_31 {
//    Next Permutation
    public void nextPermutation(int[] nums) {
        int ind1=-1,ind2=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>ind1;i--){
            if(nums[ind1]<nums[i]){
                ind2=i;
                break;
            }
        }
        swap(nums,ind1,ind2);
        reverse(nums,ind1+1,nums.length-1);
    }
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
