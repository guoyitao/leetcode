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

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        if (root.val > high) return trimBST(root.left,low,high);
        if (root.val < low) return trimBST(root.right,low,high);

        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);

        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(2);

        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode2.right = treeNode3;
        treeNode3.left = treeNode4;

        treeNode1.right = treeNode5;

        new Solution().trimBST(treeNode1,1,3);


    }
}