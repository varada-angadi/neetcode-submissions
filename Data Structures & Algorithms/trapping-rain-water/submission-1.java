class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int result = 0;

        while(left<right){
            if(height[left]<height[right]){
                if(leftMax-height[left]>0){
                    result+=leftMax-height[left];
                }
                leftMax= Math.max(leftMax, height[left]);
                left++;
                
            }
            else{
                if(rightMax-height[right]>0){
                    result+=rightMax-height[right];
                }
                rightMax= Math.max(rightMax, height[right]);
                right--;
            }
        }
        return result;
        
    }
}
