class Solution {
    public int pivotIndex(int[] nums) {
        int prefix []=new int [nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           prefix[i]=prefix[i-1]+nums[i];
        }
        int rightsum=0;
        int leftsum=0;
        for(int j=0;j<prefix.length;j++){
            int mid=j;
            if(mid==0){leftsum=0;}
            else{leftsum=prefix[mid-1];}

            if(mid==prefix.length-1){rightsum=0;}
            else{rightsum=prefix[prefix.length-1]-prefix[mid];}
           
           if(leftsum==rightsum){return mid;}
    }
    return -1;}
}