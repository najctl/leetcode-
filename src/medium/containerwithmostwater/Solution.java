package medium.containerwithmostwater;

class Solution {
    public int maxArea(int[] height) {
//        int maxr=0;
//        int maxl=0;
//        int indexi=0;
//        int indexl=0;
//        int left= height.length-1;
//        for (int i = 0; i < height.length; i++) {
//            if (height[i]+i>maxr){
//                maxr=height[i];
//                indexi=i;
//            }
//            if (height[left]+left>maxl){
//                maxl=height[left];
//                indexl=left;
//            }
//            left--;
//
//        }
//        int high = (maxr > maxl) ? maxl : maxr;
//
//        int bigindex = Math.max(indexl,indexi);
//        int minindex = Math.min(indexi,indexl);
//        int width= bigindex-minindex;
//        return high*width;

        int left = 0;
        int right = height.length-1;
        int maxArea=0;
        while (left<right){
             int cur= Math.min(height[left],height[right])*(right-left);
             maxArea =Math.max(maxArea,cur);

            if (height[right]<height[left]) {
                right--;
            }else {
                left++;
            }
        }
        return maxArea;
    }
}
