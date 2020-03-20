package session2;

import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class LowestCommonAncesstorOfDeepestNode {

    public TreeNode_1 lcaDeepestLeaves(TreeNode_1 root) {
        if (root==null)return null;
        TreeNode_1 ancesstor=_getAncesstor(root);
        return ancesstor;
    }

    private TreeNode_1 _getAncesstor(TreeNode_1 root) {
        if (root==null)return null;
        else {
            Queue<TreeNode_1> queue = new LinkedList<>();
            queue.offer(root);
            List<TreeNode_1> treeNodes=new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode_1 temp= queue.poll();
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
