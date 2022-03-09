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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new LinkedList<List<Integer>>();
        if(root==null) return result;
        
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
           int len= queue.size();
           List<Integer> list= new ArrayList<Integer>();
        
        
        for(int i=0;i<len;i++){
            TreeNode temp= queue.poll();
            if(temp.left!=null)  queue.offer(temp.left);
            if(temp.right!=null) queue.offer(temp.right);
            list.add(temp.val);
        }
            result.add(list);
        }
            return result;
    }
        
    
}