package session2;

import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class InsertIntoBST {

    public TreeNode insertIntoBST(TreeNode rootNode, int data) {
        if (rootNode==null)return new TreeNode(data);
        else {
            if (rootNode.val>data){
                rootNode.left=insertIntoBST(rootNode.left,data);
            }
            else {
                rootNode.right=insertIntoBST(rootNode.right, data);
            }
        }
        return rootNode;
    }
}
