import sun.reflect.generics.tree.Tree;

import java.util.*;

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

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c) +1);
            }
        }
        int ji = 0;
        for (Integer value : map.values()) {
            if (value % 2 == 0){
                result += value;
            }else{
                ji++;
            }
        }
        return ji != 0 ?result +1 : result ;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("aaacccccccaablk"));

    }

}