//给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
//
//        找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//        返回容器可以储存的最大水量。
//
//        说明：你不能倾斜容器。
//
//

public class LetCode11 {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;//左指针
        int right=height.length-1;//右指针
        while (left<right){
            int mid=Math.min(height[left],height[right])*(right-left);
            max=Math.max(max,mid);
            if(height[left]<=height[right])
            {
                left++;
            }
            else {
                right--;
            }

        }
        return max;
    }
}
