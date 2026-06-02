class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxi = 0;
        while(left<right){
            int localMax=0;
            if(heights[left]<heights[right]){
                localMax = heights[left] * (right-left);
                left++;
            }
            else{
                localMax = heights[right] * (right-left);
                right--;
            }
            maxi = Math.max(maxi, localMax);
        }
        return maxi;
        
    }
}
