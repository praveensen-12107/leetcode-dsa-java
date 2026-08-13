/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> helper(TreeNode root,List<Integer> list){
        
        
        if(root==null ){
            List<Integer> a= new ArrayList<>();

            return a;
        }
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
        return list;

    }



    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        return helper(root,ans);

        
    }
}