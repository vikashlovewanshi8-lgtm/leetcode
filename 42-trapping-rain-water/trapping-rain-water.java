class Solution {
    public int trap(int[] height) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        int trapeedwater = 0;
        for (int j = 0; j < height.length; j++) {
            int min = Math.min(leftMax[j], rightMax[j]);
            int eachBarWater = min - height[j];
            trapeedwater += eachBarWater;

        }
        return trapeedwater;
    }
}