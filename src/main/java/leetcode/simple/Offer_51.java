package leetcode.simple;

public class Offer_51 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;
        }
    }
    public int maxDepth(TreeNode root) {
          if(root == null){
              return 0;
          }

          int leftDepth = maxDepth(root.left);
          int rightDepth = maxDepth(root.right);


        return leftDepth>rightDepth?leftDepth+1:rightDepth+1;
    }




}
