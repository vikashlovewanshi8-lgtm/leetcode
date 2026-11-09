class Solution {
    public int subarraySum(int[] nums, int k) {
    int prefix[]=new int[nums.length];
    prefix[0]=nums[0];
    int currentsum=0;
    int count=0;
    for(int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+nums[i];
    }
    for(int j=0;j<prefix.length;j++){
        int start =j;
        for(int m=j;m<prefix.length;m++){
            int end=m;
             currentsum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
             if(currentsum==k){count++;}
        }
    }
        return count;
    }
}