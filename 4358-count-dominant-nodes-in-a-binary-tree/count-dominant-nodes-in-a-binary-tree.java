class Solution {

    int cnt = 0;

    private int helper(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            cnt++;
            return root.val;
        }

        int leftMax = helper(root.left);
        int rightMax = helper(root.right);

        if(root.val >= leftMax && root.val >= rightMax) cnt++;

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }
    public int countDominantNodes(TreeNode root) {
        if(root == null) return 0;

        helper(root);

        return cnt;
    }
}