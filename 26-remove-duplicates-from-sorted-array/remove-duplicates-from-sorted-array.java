class Solution {
    public int removeDuplicates(int[] nums) {
        //int arr[]=new int[nums.length];
int k=1;
// arr[0]=nums[0];
// int i=0;
// int j=1;
//  while(i<nums.length-1){
//   if(nums[i]!=nums[j]){
//     arr[k]=nums[j];
//     k++;
//        }
     
//     }
//     return k;
    

//     }
for(int j=1;j<nums.length;j++){
    if(nums[j]!=nums[j-1]){
        nums[k]=nums[j];
        k++;
    }
} return k;
}}