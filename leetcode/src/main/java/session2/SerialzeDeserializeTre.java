package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Dhiraj
 * @date 02/10/19
 */
public class SerialzeDeserializeTre {

    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getTreeData();
        String ser=serialize(root);
        System.out.println(ser);
        System.out.println(deserialize(ser));

    }

    public static String serialize(TreeNode_1 root) {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<TreeNode_1> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode_1 h = q.poll();
            if (h == null) {
                list.add("#");
            } else {
                list.add("" + h.val);
                q.offer(h.left);
                q.offer(h.right);
            }
        }

        return String.join(",", list);
    }

    // Decodes your encoded data to tree.
    public static TreeNode_1 deserialize(String data) {
        String[] arr = data.split(",");
        if (arr[0].equals("#")) {
            return null;
        }

        TreeNode_1 root = new TreeNode_1(Integer.parseInt(arr[0]));
        LinkedList<TreeNode_1> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty()) {
            TreeNode_1 h = q.poll();
            if (h != null) {
                TreeNode_1 left = null;
                if (!arr[i].equals("#")) {
                    left = new TreeNode_1(Integer.parseInt(arr[i]));
                }
                h.left = left;
                q.offer(left);
                i++;

                TreeNode_1 right = null;
                if (!arr[i].equals("#")) {
                    right = new TreeNode_1(Integer.parseInt(arr[i]));
                }
                h.right = right;
                q.offer(right);
                i++;
            }
        }

        return root;
    }
}
