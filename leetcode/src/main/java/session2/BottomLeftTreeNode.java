package session2;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class BottomLeftTreeNode {

    public int findBottomLeftValue(TreeNode root) {
        if (root==null)return 0;
        else {
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> result=new ArrayList<>();
            List<Integer> integers=new ArrayList<>();
            int left=0;
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    integers.add(temp.val);
                    if (temp.left!=null) {
                        q.offer(temp.left);
                        left=temp.left.val;
                    }
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    result.add(integers.get(integers.size()-1));
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();
                }
            }
            return left;
        }

    }
}
