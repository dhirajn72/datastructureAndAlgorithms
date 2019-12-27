package session2;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class LowestCommonAncesstorOfDeepestNode {

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root==null)return null;
        TreeNode ancesstor=_getAncesstor(root);
        return ancesstor;
    }

    private TreeNode _getAncesstor(TreeNode root) {
        if (root==null)return null;
        else {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            List<TreeNode> treeNodes=new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode temp= queue.poll();
                if (temp!=null){
                    treeNodes.add(temp);
                    if (temp.left!=null)
                        queue.offer(temp.left);
                    if (temp.right!=null)
                        queue.offer(temp.right);
                }
            }
            return treeNodes.get(treeNodes.size()-1);
        }
    }
}
