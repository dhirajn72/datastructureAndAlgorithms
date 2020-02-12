package session3;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 04/01/20
 */
public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        if (root==null)return new ArrayList<>();
        return _rightSideView(root);
    }

    private List<Integer> _rightSideView(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);
        List<Integer> levels=new ArrayList<>();
        List<Integer> result=new ArrayList<>();

        while (!q.isEmpty()){
            TreeNode temp=q.poll();
            levels.add(temp.val);
            if (temp!=null){
                if (temp.left!=null)
                    q.offer(temp.left);
                if (temp.right!=null)
                    q.offer(temp.right);
            }
            else {
                if (levels.size()>=1)
                    result.add(levels.get(levels.size()-1));
                if (!q.isEmpty())
                    q.offer(null);
                levels.clear();
            }
        }
        return result;
    }
}
