package interview;

/**
 * @author Dhiraj
 * @date 18/03/19
 */
public class BinarySeacrhTreeOperations {

    public BinarySearchTreeNode insert(BinarySearchTreeNode root,int data){
        if (root==null){
            return new BinarySearchTreeNode(data);
        }
        else {
            if (data>root.getData()){
                root.setRight(insert(root.getRight(),data));
            }
            else if (data<root.getData()){
                root.setLeft(insert(root.getLeft(),data));
            }
        }
        return root;
    }

    public BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
        if (root == null) return null;
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }
    public BinarySearchTreeNode findMax(BinarySearchTreeNode root) {
        if (root == null) return null;
        while (root.getRight() != null) {
            root = root.getRight();
        }
        return root;
    }

    public BinarySearchTreeNode delete(BinarySearchTreeNode root,int data) {
        if (root == null){
            System.out.println("No elements to delete !");
        }
        else if (data<root.getData()){
            root.setLeft(delete(root.getLeft(),data));
        }
        else if (data>root.getData()){
            root.setRight(delete(root.getRight(),data));
        }
        else {

            if (root.getLeft()==null){
                return root.getRight();
            }
            else if (root.getRight()==null){
                return root.getLeft();
            }
            BinarySearchTreeNode min=findMin(root.getRight());
            root.setData(min.getData());
            root.setRight(delete(min.getRight(),min.getData()));

        }
        return root;

    }

    public static void main(String[] args) {

        BinarySearchTreeNode root= new BinarySearchTreeNode(15);
        BinarySeacrhTreeOperations treeOperations= new BinarySeacrhTreeOperations();
        treeOperations.insert(root,20);
        treeOperations.insert(root,9);
        treeOperations.insert(root,10);

        treeOperations.insert(root,7);
        treeOperations.insert(root,26);
        treeOperations.insert(root,4);
        System.out.println(root);
        System.out.println(treeOperations.findMin(root));
        System.out.println(treeOperations.findMax(root));
        BinarySearchTreeNode del=treeOperations.delete(root,15);
        System.out.println("Deleted node is::"+del);
        System.out.println();
        System.out.println(root);
        System.out.println("*****");

    }
}
