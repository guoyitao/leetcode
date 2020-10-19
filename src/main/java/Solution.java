import sun.reflect.generics.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Solution {
    public int first = Integer.MAX_VALUE;
    public int second = Integer.MAX_VALUE;
    public int count = 0;

    public int findSecondMinimumValue(TreeNode root) {
        help(root);
        return count == 0 ? -1 : second;
    }

    public void help(TreeNode root){
        if (root == null){
            return;
        }
        if (root.val < first){
            second = first;
            first = root.val;
        }else if (root.val <= second && root.val > first){
            count++;
            second = root.val;
        }
        help(root.left);
        help(root.right);

    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(5);

        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        new Solution().findSecondMinimumValue(treeNode1);


    }
}