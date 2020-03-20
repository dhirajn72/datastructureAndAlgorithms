package session2;

import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class LargestValueInEachRow {


    public List<Integer> largestValues(TreeNode_1 root) {
        if (root==null)return new ArrayList<>();
        else {
            Queue<TreeNode_1> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> res=new ArrayList<>();
            List<Integer> ints=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode_1 temp=q.poll();
                if (temp!=null){
                    ints.add(temp.val);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    int max=Integer.MIN_VALUE;
                    for (int i:ints)
                        max=Math.max(max,i);
                    res.add(max);
                    if (!q.isEmpty())
                        q.offer(null);
                    ints.clear();

                }
            }
            return res;
        }
    }
}
