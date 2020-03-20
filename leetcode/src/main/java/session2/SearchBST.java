package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class SearchBST {
    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getBinarySearchTreeData();
        System.out.println(searchBST(root,65));
    }

    public static TreeNode_1 searchBST(TreeNode_1 root, int val) {
        if (root==null)return null;
        return _search(root,val);
    }

    private static TreeNode_1 _search(TreeNode_1 root, int val) {
        if (root==null)return null;
        if (val<root.val){
           return  _search(root.left,val);
        }
        else if (val>root.val){
           return  _search(root.right,val);
        }
        else if (root.val==val)
            return root;
        return null;
    }
}
