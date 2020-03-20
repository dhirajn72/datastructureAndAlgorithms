package session2;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class InsertIntoBST {

    public TreeNode_1 insertIntoBST(TreeNode_1 rootNode, int data) {
        if (rootNode==null)return new TreeNode_1(data);
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
