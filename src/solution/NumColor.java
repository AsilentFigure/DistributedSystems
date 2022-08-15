package solution;

import tool.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 *LCP 44. 开幕式焰火
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/15 11:37
 */
public class NumColor {
    public int numColor(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        preOrderTraversal(root, set);
        return set.size();
    }

    public void preOrderTraversal(TreeNode treeNode, Set set){
        if(null == treeNode){
            return;
        }
        set.add(treeNode.val);
        preOrderTraversal(treeNode.left, set);
        preOrderTraversal(treeNode.right, set);
    }
}
