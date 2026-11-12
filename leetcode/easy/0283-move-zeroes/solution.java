class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int pos = 0;

        while( pos <nums.length){
            if(nums[pos] !=0){
                int temp= nums[pos];
                nums[pos] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
            pos++;
        }

        

        
    }
}