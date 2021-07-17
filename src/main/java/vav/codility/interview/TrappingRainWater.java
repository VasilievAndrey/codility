package vav.codility.interview;

public class TrappingRainWater {

    public static int trap(int[] height) {

        if (height == null || height.length < 3) {
            return 0;
        }
        int leftInd = 0;
        int rightInd = height.length -1;
        int leftMax = height[0];
        int rightMax = height[rightInd];
        int result = 0;
        while (leftInd < rightInd) {
            if (height[leftInd]  < height[rightInd] ) {
                if (leftMax <= height[leftInd]) {
                    leftMax = height[leftInd];
                } else {
                    result = result + leftMax - height[leftInd];
                }
                leftInd++;
            } else {
                if (rightMax <= height[rightInd]) {
                    rightMax = height[rightInd];
                } else {
                    result = result + rightMax - height[rightInd];
                }
                rightInd--;
            }
        }
        return result;
    }
}
