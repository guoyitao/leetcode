

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        for (int k = m + n -1; k > 0; k--) {
            if (nums1[i] > nums2[j]){
                nums1[k] = nums1[i--];
            }else if (nums1[i] < nums2[j]){
                nums1[k] = nums2[j--];
            }else if (i<0){
                nums1[k] = nums2[j--];
            }else{
                nums1[k] = nums1[i--];
            }
        }

        return;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));

        new Solution().merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}