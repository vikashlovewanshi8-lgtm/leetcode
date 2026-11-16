class Solution {
    public int[] sortedSquares(int[] nums) {

        //     for(int i=0;i<nums.length;i++){
        //         nums[i]=nums[i]*nums[i];
        //     }
        //   Arrays.sort(nums);
        //   return nums;

        int i = 0;
        int j = nums.length - 1;
        ;
        while (i <= j) {
            nums[i] = nums[i] * nums[i];
            if(i==j) break;
            nums[j] = nums[j] * nums[j];
            i++;
            j--;
        }
        Arrays.sort(nums);
        return nums;
    }

}