// https://leetcode.com/problems/container-with-most-water/description/


class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int maxArea = 0;

        int start = 0;
        int end = n-1;

        while(start<end){

            int length = Math.min(height[start], height[end]);
            int width = Math.abs(start-end);
            int area = length * width;

            maxArea = Math.max(maxArea, area);

            if(height[start] > height[end]){
                end--;
            }
            else{
                start++;
            }
        }

        return maxArea;
       
    }
}














 // for(int i = 0 ; i<n ; i++){               // TC:- O(N^2) 
        //     for(int j = i+1 ; j<n ; j++){
        //         int length = Math.min(height[i], height[j]);
        //         int width = Math.abs(i-j);
        //         int area = length * width;

        //         maxArea = Math.max(maxArea, area);
        //     }
        // }
        
        // return maxArea;
