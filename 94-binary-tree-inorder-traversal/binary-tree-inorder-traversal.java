
class Solution {
    public void traverse(TreeNode root, List<Integer> ans){
        if(root == null) return;

        traverse(root.left, ans);
        ans.add(root.val);
        traverse(root.right, ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traverse(root, ans);

        return ans;
    }
}