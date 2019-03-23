/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
      if (root != null) {
        List<Integer> topLevel = new ArrayList();
        topLevel.add(root.val);
        list.add(topLevel);
        walkthrough(root.left, 1);
        walkthrough(root.right, 1);
      }
      return list;
    }
  
    public void walkthrough(TreeNode node, int deepth) {
      if (node != null) {
        if (list.size() <= deepth) {
          List<Integer> level = new ArrayList();
          list.add(level);
        }
        list.get(deepth).add(node.val);
        deepth++;
        walkthrough(node.left, deepth);
        walkthrough(node.right, deepth);
      }
    }
}

