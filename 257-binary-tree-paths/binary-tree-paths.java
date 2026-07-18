class Solution {
    private void helper(TreeNode root, String s, List<String> ans){
        if(root == null) return;

        if(root.left == null && root.right == null){
            ans.add(s + root.val);
            return;
        } 
        helper(root.left, s + root.val + "->", ans);
        helper(root.right, s + root.val + "->", ans);
         
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String s = "";

        helper(root, s, ans);

        return ans;
    }
}