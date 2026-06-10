
class Solution {
    public void pre(Node root, List<Integer> ans){
        if(root == null) return;

        ans.add(root.val);

        for(Node child: root.children){
            pre(child, ans);
        }
        
    }
    public List<Integer> preorder(Node root) {
        List<Integer> ans  = new ArrayList<>();
        pre(root, ans);
        
        return ans;
    }
}