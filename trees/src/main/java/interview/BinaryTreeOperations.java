package interview;

import com.java.ds.client.DataUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 17/06/19
 */
public class BinaryTreeOperations {
    public static void main(String[] args) {
        BinaryTreeNode root = DataUtils.getBinaryOrderedTree();
        findDeepestNode(root);
        searchElement(root, 7);
        System.out.println("Search recursive::" + searchElementRecursively(root, 7));
        findHeightOfTree(root);
        findHeightOfTree(DataUtils.getLeftSkeewedBinaryOrderedTree());
        System.out.println("Largest element is:: " + findLargestElement(root));
        findLargestElementIterative(root);
        System.out.println("Print Bottom up::");
        printBottomUp(root);
        System.out.println("Number of Leaf nodes::");
        findNumberOfLeafNodes(root);
        System.out.println(diameter(root));
        System.out.println("All leaf nodes::");
        printAllLeafNodes(root);

        /**
         *
         * TODO!
         */
        System.out.println("Paths::");
        printPaths(root);
        System.out.println("Mirrors::");
        System.out.println(root);
        BinaryTreeNode root1= new BinaryTreeNode(1);
        root1.setLeft(new BinaryTreeNode(2));
        root1.setRight(new BinaryTreeNode(3));

        BinaryTreeNode mirror= new BinaryTreeNode(1);
        mirror.setLeft(new BinaryTreeNode(3));
        mirror.setRight(new BinaryTreeNode(2));
        //System.out.println(mirrors(root1));;
        //System.out.println(mirrors(root));;
        System.out.println("Are mirrors::");
        //System.out.println(areMirrors(root1,mirror));
        System.out.println(areMirrors(root,DataUtils.getBinaryMirrorOrderedTree()));
        System.out.println("Sum of all nodes::");
        System.out.println(sumOfAllNodesRecursive(root));
        sumOfAllNodesIterative(root);

        /**

           3
          / \
         2   4
         / \   \
         1   3   5

         *
         */

        BinaryTreeNode continousTree= new BinaryTreeNode(3);
        BinaryTreeNode node=new BinaryTreeNode(2);

        continousTree.setLeft(node);
        /*continousTree.setLeft(new BinaryTreeNode(2));
        continousTree.getLeft().setLeft(new BinaryTreeNode(1));
        continousTree.getLeft().setRight(new BinaryTreeNode(3));*/
        continousTree.setRight(new BinaryTreeNode(4));
        /*BinaryTreeNode node=new BinaryTreeNode(5);
        continousTree.getRight().setRight(node);*/

        System.out.println(isCountinuosTree(continousTree));
        System.out.println("Print ancesstors::");
        printAllAncesstors(continousTree,node);

        /**
         *
         *
         *
         */
        BinaryTreeNode binaryTreeNode= new BinaryTreeNode(1);
        binaryTreeNode.left=new BinaryTreeNode(2);
        BinaryTreeNode nodeA=new BinaryTreeNode(4);
        binaryTreeNode.left.left=nodeA;
        BinaryTreeNode nodeB=new BinaryTreeNode(9);
        binaryTreeNode.left.right=new BinaryTreeNode(5);
        binaryTreeNode.left.right.right=nodeB;
        binaryTreeNode.left.right.left=new BinaryTreeNode(8);


        binaryTreeNode.right=new BinaryTreeNode(3);
        binaryTreeNode.right.left=new BinaryTreeNode(6);
        binaryTreeNode.right.right=new BinaryTreeNode(7);
        System.out.println(findLCAofTwoNodes(binaryTreeNode,nodeA,nodeB));
    }

    private static BinaryTreeNode findLCAofTwoNodes(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b) {
        if ( root==null) return root;
        if (root==a || root==b)
            return root;
        BinaryTreeNode left=findLCAofTwoNodes(root.getLeft(),a,b);
        BinaryTreeNode right=findLCAofTwoNodes(root.getRight(),a,b);
        if (left!=null && right!=null)
            return root;
        else
            return left!=null ?left:right;
    }

    private static boolean printAllAncesstors(BinaryTreeNode root, BinaryTreeNode node) {
        if (root==null)return false;
        if (root.getLeft()==node || root.getRight()==node || printAllAncesstors(root.getLeft(),node) || printAllAncesstors(root.getRight(),node)) {
            System.out.println(root.getData());
            return true;
        }
        return false;
    }

    private static void printAllLeafNodes(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q=new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> leafNodes= new ArrayList<>();
        while (!q.isEmpty()){
            BinaryTreeNode temp=q.poll();
            if (temp!=null){
                if (temp.getLeft()==null && temp.getRight()==null)
                    leafNodes.add(temp.getData());
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
            }
        }
        System.out.println(leafNodes);

    }

    private static void sumOfAllNodesIterative(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        int sum=0;
        while (!q.isEmpty()){
            BinaryTreeNode temp=q.poll();
            if (temp!=null){
                sum+=temp.getData();
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
            }
        }
        System.out.println("Sum of all nodes are::"+sum);

    }

    private static int sumOfAllNodesRecursive(BinaryTreeNode root) {
        if (root==null)return 0;
        return (root.getData()+sumOfAllNodesRecursive(root.getLeft())+sumOfAllNodesRecursive(root.getRight()));


    }

    private static boolean areMirrors(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1==null && root2==null)
            return true;
        if (root1==null || root2==null)
            return false;
        if (root1.getData()!=root2.getData())
            return false;
        return areMirrors(root1.getLeft(),root2.getRight()) && areMirrors(root1.getRight(),root2.getLeft());



    }

    private static BinaryTreeNode mirrors(BinaryTreeNode root) {
        BinaryTreeNode temp=null;
        if (root!=null){
            mirrors(root.getLeft());
            mirrors(root.getRight());
            temp=root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);
        }
        return root;
    }




    private static void printPaths(BinaryTreeNode root) {
        int[] path= new  int[250];
        printPaths(root,path,0);
    }

    private static void printPaths(BinaryTreeNode root, int[] path, int pathLen) {
        if (root==null)
            return;
        path[pathLen]=root.getData();
        pathLen++;
        if (root.getLeft()==null && root.getRight()==null){
            printArray(path,pathLen);
        }
        else {
            printPaths(root.getLeft(),path,pathLen);
            printPaths(root.getRight(),path,pathLen);
        }
    }

    private static void printArray(int[] path, int pathLen) {
        for (int i=0;i<pathLen;i++)
            System.out.print(path[i]+" ");
        System.out.println();
    }

    private static void findNumberOfLeafNodes(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        int count=0;
        while (!q.isEmpty()){
            BinaryTreeNode temp=q.poll();
            if (temp!=null){
                if (temp.getLeft()==null&&temp.getRight()==null)
                    count++;
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
            }

        }
        System.out.println("Number of leaf nodes::"+count);

    }

    /**
     *
     *
     * @param root
     */
    public static void findDeepestNode(BinaryTreeNode root){
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        BinaryTreeNode temp=null;
        while (!q.isEmpty()){
            temp=q.remove();
            if (temp.getLeft()!=null)
                q.offer(temp.getLeft());
            if (temp.getRight()!=null)
                q.offer(temp.getRight());
        }
        System.out.println(temp);
    }

    public static int findLargestElement(BinaryTreeNode root){
        int max=Integer.MIN_VALUE;
        if (root!=null){
            int leftMax=findLargestElement(root.getLeft());
            int rightMax=findLargestElement(root.getRight());
            max=leftMax>rightMax ? leftMax:rightMax;
            return root.data>max ? root.getData() :max;
        }
        return max;
    }

    /**
     *
     * This can be done using level order traversals.
     * @param root
     */
    public static void findLargestElementIterative(BinaryTreeNode root){
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        int max=Integer.MIN_VALUE;
        while (!q.isEmpty()){
            BinaryTreeNode temp=q.poll();
            if (temp!=null) {
                if (temp.getData()>max)max=temp.getData();
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
            }
        }
        System.out.println("Largest element is:::"+max);
    }


    /**
     *
     * Searching of element can be done using level order traversals
     *
     * @param root
     * @param key
     */
    public static void searchElement(BinaryTreeNode root,int key){
        ArrayList<ArrayList<Integer>> arrayLists= new ArrayList<>();
        ArrayList<Integer> integers= new ArrayList<>();
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()){
            BinaryTreeNode temp= q.remove();
            if (temp!=null){
                //System.out.print(temp.getData()+",");
                if (key==temp.getData()) {System.out.println("Found:::"+temp.getData()); return;}
                integers.add(temp.getData());
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
            }
            else {
                arrayLists.add(new ArrayList<Integer>(integers));
                integers.clear();
                if (!q.isEmpty())q.offer(null);

            }
        }
        System.out.println(arrayLists);
    }

    public static boolean searchElementRecursively(BinaryTreeNode root,int key){
        if (root==null)
            return false;
        if (root.getData()==key)
            return true;
        return searchElementRecursively(root.getLeft(),key) || searchElementRecursively(root.getRight(),key);
    }

    /**
     *
     * This can be done with level order traversals
     * @param root
     */
    public static void findHeightOfTree(BinaryTreeNode root){
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int height=0;
        while (!q.isEmpty()){
            BinaryTreeNode temp=q.remove();
            if (temp!=null ){
                System.out.print(temp.getData()+",");
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
            }
            else {
                height++;
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        System.out.println("\nHeight of the tree is ::"+height);
    }

    public static void printBottomUp(BinaryTreeNode root){
        Queue<BinaryTreeNode> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);
        ArrayList<ArrayList<Integer>> arrayLists= new ArrayList<>();
        ArrayList<Integer> integers= new ArrayList<>();
        Stack<ArrayList<Integer>> arrayLists1= new Stack<>();

        while (!q.isEmpty()){
            BinaryTreeNode temp=q.poll();
            if (temp!=null){
                integers.add(temp.getData());
                if (temp.getLeft()!=null)
                    q.offer(temp.getLeft());
                if (temp.getRight()!=null)
                    q.offer(temp.getRight());
            }
            else{
                //arrayLists.add(new ArrayList<Integer>(integers));
                arrayLists1.push(new ArrayList<Integer>(integers));
                integers.clear();
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        while (!arrayLists1.isEmpty())
            //System.out.println(arrayLists1.pop());
        arrayLists.add(arrayLists1.pop());
        System.out.println(arrayLists);
    }

    public static int diameter(BinaryTreeNode root){
        if (root==null)return 0;
        /**
         * through root
         */
        int len1=height(root.getLeft())+height(root.getRight())+1;

        /**
         * Not throught root
         */
        int len2=Math.max(diameter(root.getLeft()),diameter(root.getRight()));
        return Math.max(len1,len2);

    }

    private static int height(BinaryTreeNode root) {
        if (root==null)
            return 0;
        int leftDepth=height(root.getLeft());
        int rightDepth=height(root.getRight());
        return leftDepth>rightDepth ? leftDepth+1 :rightDepth+1;
    }
    public static boolean isCountinuosTree(BinaryTreeNode root){
        if (root==null) return Boolean.TRUE;
        if (root.getLeft() == null && root.getRight()==null)
            return Boolean.TRUE;
        if (root.getLeft()==null)
            return Math.abs(root.getData()-root.getRight().getData())==1 && isCountinuosTree(root.getRight());
        if (root.getRight()==null)
            return Math.abs(root.getData()-root.getLeft().getData())==1 && isCountinuosTree(root.getLeft());
        return Math.abs(root.getLeft().getData()-root.getData())==1 && Math.abs(root.getRight().getData()-root.getData())==1 &&
                isCountinuosTree(root.getLeft()) && isCountinuosTree(root.getRight());
    }
}
