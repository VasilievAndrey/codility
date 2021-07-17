package vav.codility.interview;

public class GuaranteeedMountain2 {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int left = 0;
        int right = n - 1;
        int mid;
        int peak_pos = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = peak_pos = mid + 1;
            } else {
                right = mid;
            }
        }
        left = 0;
        right = peak_pos;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < target) {
                left = mid + 1;
            } else if (mountainArr.get(mid) > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        left = peak_pos;
        right = n - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mountainArr.get(mid) > target) {
                left = mid + 1;
            } else if (mountainArr.get(mid) < target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public interface MountainArray {
        int get(int index);
        int length();
  }
}
