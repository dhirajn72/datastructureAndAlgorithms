package session3;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 23/02/20
 */


/*

Success
Details
Runtime: 6 ms, faster than 9.28% of Java online submissions for Count Complete Tree Nodes.
Memory Usage: 43.2 MB, less than 9.76% of Java online submissions for Count Complete Tree Nodes.
 */
public class CountNodes {

    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeDataPreOrdered();
        System.out.println(countNodes(root));
    }
    public static int countNodes(TreeNode root) {
        if (root==null)
            return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<TreeNode> list=new ArrayList<>();
        while (!q.isEmpty()){
            TreeNode temp=q.poll();
            list.add(temp);
            if (temp!=null) {
                q.offer(temp.left);
                q.offer(temp.right);
            }
        }
        int nodeSize=0;
        boolean flag=false;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)==null){
                for (int j = i; j < list.size(); j++) {
                    if (list.get(j)!=null) {
                        nodeSize=0;
                        flag=true;
                        break;
                    }
                }
            }
            if (flag)
                break;
            if (!flag && list.get(i)==null)
                break;
            nodeSize++;
        }
        return nodeSize;
    }
}
