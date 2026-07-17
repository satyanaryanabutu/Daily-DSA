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

    Map<TreeNode, TreeNode> parent = new HashMap<>();
    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        
        buildParent(root, null);

        
        dfs(target, null, k);

        return ans;
    }

    private void buildParent(TreeNode node, TreeNode par) {

        if (node == null)
            return;

        parent.put(node, par);

        buildParent(node.left, node);
        buildParent(node.right, node);
    }

    private void dfs(TreeNode node, TreeNode prev, int k) {

        if (node == null)
            return;

        if (k == 0) {
            ans.add(node.val);
            return;
        }

        if (node.left != prev)
            dfs(node.left, node, k - 1);

        if (node.right != prev)
            dfs(node.right, node, k - 1);

        if (parent.get(node) != prev)
            dfs(parent.get(node), node, k - 1);
    }
}