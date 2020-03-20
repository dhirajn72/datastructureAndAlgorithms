package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class IncreasingOrderBST {

    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        TreeNode_1 result=increasingBST(root);
        getIncreasingNumbers(root);
        getIncreasingNumbers(result);


    }


    public static TreeNode_1 increasingBST(TreeNode_1 root) {
        List<Integer> integerList=getIncreasingNumbers(root);
        TreeNode_1 rootNode=null;
        for(int i:integerList){
            rootNode=_createBST(rootNode,i);
        }
        return rootNode;
    }

    private static TreeNode_1 _createBST(TreeNode_1 rootNode, int data) {
        if (rootNode==null)return new TreeNode_1(data);
        else {
            if (rootNode.val>data){
                rootNode.left=_createBST(rootNode.left,data);
            }
            else {
                rootNode.right=_createBST(rootNode.right, data);
            }
        }
        return rootNode;
    }

    public static List<Integer> getIncreasingNumbers(TreeNode_1 root) {
        if (root==null)return null;
        else {
            Queue<TreeNode_1> queue = new LinkedList<>();
            queue.offer(root);
            queue.offer(null);
            List<Integer> treeNodes=new ArrayList<>();
            List<Integer> integers=new ArrayList<>();

            List<List<Integer>>  list=new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode_1 temp= queue.poll();
                if (temp!=null){
                    treeNodes.add(temp.val);
                    integers.add(temp.val);
                    if (temp.left!=null)
                        queue.offer(temp.left);
                    if (temp.right!=null)
                        queue.offer(temp.right);
                }else {
                    list.add(new ArrayList<>(integers));
                    if (!queue.isEmpty())
                        queue.offer(null);
                    integers.clear();
                }
            }
            System.out.println(list);
            return treeNodes;
        }
    }
}
