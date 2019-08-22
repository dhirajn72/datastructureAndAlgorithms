package clrs;

import interview.BinaryTreeNode;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 23/07/19
 */
public class TreeOperations {
    public static void main(String[] args) {
        //BinaryTreeNode root = DataUtils.getBinarySearchTree();

        BinaryTreeNode root = new BinaryTreeNode(10);

        BinaryTreeNode n;
        root.setLeft(new BinaryTreeNode(8));
        root.getLeft().setLeft(new BinaryTreeNode(7));
        root.getLeft().setRight(new BinaryTreeNode(9));

        root.setRight(new BinaryTreeNode(12));
        n = new BinaryTreeNode(13);
        root.getRight().setRight(n);
        root.getRight().setLeft(new BinaryTreeNode(11));

        System.out.println(_searchRecursive(root, 8));
        System.out.println(_searchIterative(root, 12));

        System.out.println("Successor::is");
        System.out.println(inOrderSuccessor(root, n));

        BinaryTreeNode root1 = null;
        root1 = _createBST(root1, new BinaryTreeNode(10));
        root1 = _createBST(root1, new BinaryTreeNode(8));
        root1 = _createBST(root1, new BinaryTreeNode(12));
        root1 = _createBST(root1, new BinaryTreeNode(7));
        root1 = _createBST(root1, new BinaryTreeNode(9));
        root1 = _createBST(root1, new BinaryTreeNode(13));
        root1 = _createBST(root1, new BinaryTreeNode(11));
        System.out.println(root1);


        BinaryTreeNode root2 = new BinaryTreeNode(1);
        root2.left= new BinaryTreeNode(2);
        root2.right=new BinaryTreeNode(3);
        root2.left.left=new BinaryTreeNode(4);
        root2.left.right=new BinaryTreeNode(5);

        /*
           1
         / \
        2   3
       / \
      4   5

         */

       // System.out.println(_deleteNode(root2, 10));
       // System.out.println(_deleteNode(root2, root2));

        System.out.println("*********");
        System.out.println(_diameter(root2));
    }

    private static int _diameter(BinaryTreeNode root) {
        if (root==null)return 0;
        if (root.left==null && root.right==null)return 0;
        if (root.left==null || root.right==null)return 0;

        int height= _height(root.left)+_height(root.right);
        int diameter=Math.max(_diameter(root.left),_diameter(root.right))+1;
        return Math.max(height,diameter);
    }

    private static int _height(BinaryTreeNode root) {
        if (root==null)return 0;
        int left=_height(root.left);
        int right=_height(root.right);
        return Math.max(left,right)+1;
    }
    /*private static BinaryTreeNode _deleteNode(BinaryTreeNode root, int key) {
        if (root == null)
            return null;
        else if (root.data > key)
            root.setLeft(_deleteNode(root.left, key));
        else if (root.data < key)
            root.setRight(_deleteNode(root.right, key));
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;


            BinaryTreeNode min = _findMin(root.right);
            root.setData(min.getData());
            root.setRight(_deleteNode(root.right, min.data));
        }
        return root;
    }*/

    private static BinaryTreeNode _deleteNode(BinaryTreeNode root, BinaryTreeNode key) {
        if (root == null)
            return null;
        else if (root.data > key.data)
            root.setLeft(_deleteNode(root.left, key));
        else if (root.data < key.data)
            root.setRight(_deleteNode(root.right, key));
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;


            BinaryTreeNode min = _findMin(root.right);
            root.setData(min.getData());
            root.setRight(_deleteNode(root.right, min));
        }
        return root;
    }

    private static BinaryTreeNode _findMin(BinaryTreeNode root) {
        if (root == null)
            return null;
        while (root.left != null)
            root = root.left;
        return root;
    }

    private static BinaryTreeNode _createBST(BinaryTreeNode root, BinaryTreeNode node) {
        if (root == null && node != null)
            return node;
        if (root != null && node == null) return root;
        else {
            BinaryTreeNode x = root;
            BinaryTreeNode y = null;
            while (x != null) {
                y = x;
                if (x.data < node.data)
                    x = x.right;
                else
                    x = x.left;
            }
            if (y.data < node.data)
                y.setRight(node);
            else
                y.setLeft(node);
            return root;
        }
    }

    public static BinaryTreeNode inOrderSuccessor(BinaryTreeNode root, BinaryTreeNode p) {
        if (root == null || p == null) return null;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            boolean flag = false;
            while (!s.isEmpty() || root != null) {
                if (root != null) {
                    s.push(root);
                    root = root.left;
                } else {
                    BinaryTreeNode temp = s.pop();
                    if (flag) return temp;
                    if (temp == p)
                        flag = true;
                    root = temp.getRight();
                }
            }
            return null;
        }
    }


    public static BinaryTreeNode successor(BinaryTreeNode root) {

        if (root.right != null)
            return successor(root.right);
        //BinaryTreeNode y=
        return null;
    }
    public static BinaryTreeNode _searchRecursive(BinaryTreeNode root, int key) {
        if (root == null || root.data == key)
            return root;
        if (root.data > key)
            return _searchRecursive(root.left, key);
        else return _searchRecursive(root.right, key);
    }

    public static BinaryTreeNode _searchIterative(BinaryTreeNode root, int key) {
        while (root != null && root.data != key) {
            if (root.data > key)
                root = root.left;
            else
                root = root.right;
        }
        return root;
    }
}
