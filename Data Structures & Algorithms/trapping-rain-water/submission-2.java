class Solution {
    public int trap(int[] height) {
        int right = height.length-1;
        int left = 0;
        int rightMax = height[right];
        int leftMax = height[left];
        int quant = 0;
        while(left<right){
            if(height[left]<height[right]){
                if(leftMax - height[left]>0){
                    quant += leftMax-height[left];
                }
                leftMax = Math.max(leftMax, height[left]);
                left++;
            }
            else{
                if(rightMax - height[right]>0){
                    quant += rightMax-height[right];
                }
                rightMax = Math.max(rightMax, height[right]);
                right--;
            }

            }
            return quant;
        }
}



