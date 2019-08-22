package karumanchi;


import java.util.*;

/**
 * @author Dhiraj
 * @date 11/07/19
 */
public class BinaryTreeOperations {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root = _insertLevelOrder(root, 2);
        root = _insertLevelOrder(root, 3);
        root = _insertLevelOrder(root, 4);
        root = _insertLevelOrder(root, 5);
        root = _insertLevelOrder(root, 6);
        root = _insertLevelOrder(root, 7);
        // root = _insertLevelOrder(root, 8);

        System.out.println(root);
        _preOrder(root);
        System.out.println();
        _postOrder(root);
        System.out.println();
        _inOrder(root);
        System.out.println();
        _levelOrder(root);
        System.out.println();
        System.out.println("*******");
        //  _deleteNode(root, 3); // TODO! FInd the logic to delete node from BT, not BST
        System.out.println(_getLeafNodeCount(root));
        System.out.println(_nodeWithOneChild(root));
        System.out.println();
        System.out.println(_nodeWithNoChild(root));
        System.out.println();
        System.out.println(_totalNoChild(root));
        System.out.println(_totalNoOfFullNode(root));
        System.out.println(_findMaxELement(root));
        System.out.println(_findMaxELementRecursive(root));
        System.out.println(_search(root, 5));
        System.out.println(_searchRecursive(root, 5));

        //BinaryTreeNode root1=root;
        BinaryTreeNode root1 = new BinaryTreeNode(1);
        root1 = _insertLevelOrder(root1, 3);
        root1 = _insertLevelOrder(root1, 2);
        root1 = _insertLevelOrder(root1, 7);
        root1 = _insertLevelOrder(root1, 6);
        root1 = _insertLevelOrder(root1, 5);
        root1 = _insertLevelOrder(root1, 4);
        // root1 = _insertLevelOrder(root1, 8);
        System.out.println("##");
        System.out.println(_checkStructuralIdentical(root, root1));
        System.out.println(_checkTreeAreMirrors(root, root1));


        BinaryTreeNode root2 = new BinaryTreeNode(1);
        root2 = _insertLevelOrder(root2, 3);
        root2 = _insertLevelOrder(root2, 2);
        //System.out.println(_findDiameter(root2).diameter);
        //System.out.println(_findDiameter(root2).height);
        System.out.println(getDiameter(root2));
        System.out.println(_findHeight(root2));
        System.out.println(_findHeightUsingLevelOrder(root2));
        System.out.println(_findLevelWithMaximumSum(root));
    }

    private static Map<Integer,Integer> _findLevelWithMaximumSum(BinaryTreeNode root) {
        if (root==null)return null;
        else {
            Queue<BinaryTreeNode> q= new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int max=0;
            int level=1;
            List<List<Integer>> list= new ArrayList<>();
            List<Integer> integers= new ArrayList<>();
            Map<Integer,Integer> levelMaxSummap= new HashMap<>();
            while (!q.isEmpty()){
                BinaryTreeNode temp=q.poll();
                if (temp!=null){
                    integers.add(temp.getData());
                    if (temp.getLeft()!=null)
                        q.offer(temp.getLeft());
                    if (temp.getRight()!=null)
                        q.offer(temp.getRight());
                }
                else {
                    list.add(new ArrayList<>(integers));
                    integers.clear();
                    if (!q.isEmpty())
                        q.offer(null);
                }
            }
            for (List<Integer> i:list){
                int levelSum=i.stream().mapToInt(x->x).sum();
                levelMaxSummap.put(level++,levelSum);
            }
            //System.out.println(levelMaxSummap); // 13+9= 22
            return levelMaxSummap;
        }
    }

    private static int _findHeightUsingLevelOrder(BinaryTreeNode root) {
        if (root == null) return 0;
        else {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int height=0;
            while (!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if (temp != null) {
                    if (temp.getLeft() != null)
                        q.offer(temp.getLeft());
                    if (temp.getRight() != null)
                        q.offer(temp.getRight());
                }
                else {
                    height++;
                    if (!q.isEmpty())
                        q.offer(null);
                }
            }
            return height;
        }
    }

    private static int _findHeight(BinaryTreeNode root) {
        if (root == null) return 0;
        else return Math.max(_findHeight(root.getLeft()), _findHeight(root.getRight())) + 1;
    }

    public static int getDiameter(BinaryTreeNode root) {
        if (root == null)
            return 0;

        int rootDiameter = getHeight(root.getLeft()) + getHeight(root.getRight()) + 1;
        int leftDiameter = getDiameter(root.getLeft());
        int rightDiameter = getDiameter(root.getRight());

        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static int getHeight(BinaryTreeNode root) {
        if (root == null)
            return 0;
        return Math.max(getHeight(root.getLeft()), getHeight(root.getRight())) + 1;
    }

    private static boolean _checkStructuralIdentical(BinaryTreeNode root, BinaryTreeNode root1) {
        if (root == null && root1 == null)
            return true;
        if (root == null || root1 == null)
            return false;
        return _checkStructuralIdentical(root.getLeft(), root1.getLeft()) && _checkStructuralIdentical(root.getRight(), root1.getRight());
    }

    private static boolean _checkTreeAreMirrors(BinaryTreeNode root, BinaryTreeNode root1) {
        if (root == null && root1 == null)
            return true;
        if (root == null || root1 == null)
            return false;
        if (root.getData() != root1.getData())
            return false;
        else
            return (_checkTreeAreMirrors(root.getLeft(), root1.getRight()) && _checkTreeAreMirrors(root.getRight(), root1.getLeft()));
    }

    private static void _deleteElement(BinaryTreeNode root, int key) {
    }

    private static boolean _searchRecursive(BinaryTreeNode root, int key) {
        if (root == null) return false;
        if (root.getData() == key) return true;
        else
            return _searchRecursive(root.getLeft(), key) || _searchRecursive(root.getRight(), key);
    }

    private static int _findMaxELementRecursive(BinaryTreeNode root) {
        int max = Integer.MIN_VALUE;
        if (root != null) {
            int leftmax = _findMaxELementRecursive(root.getLeft());
            int rightMax = _findMaxELementRecursive(root.getRight());
            max = Math.max(Math.max(leftmax, rightMax), root.getData());
        }
        return max;
    }

    private static int _findMaxELement(BinaryTreeNode root) {
        int max = 0;
        if (root == null) return 0;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        Stack<Integer> out = new Stack<>();
        while (!s.isEmpty()) {
            BinaryTreeNode temp = s.pop();
            if (temp != null) {
                out.push(temp.getData());
                max = Math.max(max, temp.getData());
                if (temp.getLeft() != null)
                    s.push(temp.getLeft());
                if (temp.getRight() != null)
                    s.push(temp.getRight());
            }
        }

        while (!out.isEmpty())
            System.out.print(out.pop() + ",");
        System.out.println();
        return max;
    }

    private static int _nodeWithOneChild(BinaryTreeNode root) {
        int count = 0;
        if (root == null) return 0;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            s.push(root);
            Stack<Integer> out = new Stack<>();
            while (!s.isEmpty()) {
                BinaryTreeNode temp = s.pop();
                if (temp != null) {
                    out.push(temp.getData());
                    if ((temp.getLeft() == null && temp.getRight() != null) || (temp.getRight() == null && temp.getLeft() != null))
                        count++;
                    if (temp.getLeft() != null)
                        s.push(temp.getLeft());
                    if (temp.getRight() != null)
                        s.push(temp.getRight());
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop() + ",");
        }
        System.out.println();
        return count;
    }

    private static int _totalNoOfFullNode(BinaryTreeNode root) {
        int count = 0;
        if (root == null) return 0;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            s.push(root);
            Stack<Integer> out = new Stack<>();
            while (!s.isEmpty()) {
                BinaryTreeNode temp = s.pop();
                if (temp != null) {
                    out.push(temp.getData());
                    if (temp.getLeft() != null && temp.getRight() != null)
                        count++;
                    if (temp.getLeft() != null)
                        s.push(temp.getLeft());
                    if (temp.getRight() != null)
                        s.push(temp.getRight());
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop() + ",");
        }
        System.out.println();
        return count;
    }

    private static int _nodeWithNoChild(BinaryTreeNode root) {
        int count = 0;
        if (root == null) return 0;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            s.push(root);
            Stack<Integer> out = new Stack<>();
            while (!s.isEmpty()) {
                BinaryTreeNode temp = s.pop();
                if (temp != null) {
                    out.push(temp.getData());
                    if ((temp.getLeft() == null && temp.getRight() == null))
                        count++;
                    if (temp.getLeft() != null)
                        s.push(temp.getLeft());
                    if (temp.getRight() != null)
                        s.push(temp.getRight());
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop() + ",");
        }
        System.out.println();
        return count;
    }

    private static int _totalNoChild(BinaryTreeNode root) {
        int count = 0;
        if (root == null) return 0;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            s.push(root);
            Stack<Integer> out = new Stack<>();
            while (!s.isEmpty()) {
                BinaryTreeNode temp = s.pop();
                if (temp != null) {
                    out.push(temp.getData());
                    if ((temp.getLeft() == null && temp.getRight() == null))
                        count++;
                    if (temp.getLeft() != null)
                        s.push(temp.getLeft());
                    if (temp.getRight() != null)
                        s.push(temp.getRight());
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop() + ",");
        }
        System.out.println();
        return count;
    }

    private static int _getLeafNodeCount(BinaryTreeNode root) {
        int count = 0;
        if (root == null) return 0;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            s.push(root);
            //Stack<Integer> out= new Stack<>();
            while (!s.isEmpty()) {
                BinaryTreeNode temp = s.pop();
                if (temp != null) {
                    //out.push(temp.getData());
                    if (temp.getLeft() == null && temp.getRight() == null)
                        count++;
                    if (temp.getLeft() != null)
                        s.push(temp.getLeft());
                    if (temp.getRight() != null)
                        s.push(temp.getRight());
                }
            }
            /*while (!out.isEmpty())
                System.out.print(out.pop()+",");*/

        }
        return count;
    }

    /**
     * Perform Post order and compare the nodes data, if found return true
     *
     * @param root
     * @param data
     * @return
     */
    private static boolean _search(BinaryTreeNode root, int data) {
        if (root == null) return false;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        Stack<Integer> out = new Stack<>();
        while (!s.isEmpty()) {
            BinaryTreeNode temp = s.pop();
            if (temp != null) {
                out.push(temp.getData());
                if (data == temp.getData()) return true;
                if (temp.getLeft() != null)
                    s.push(temp.getLeft());
                if (temp.getRight() != null)
                    s.push(temp.getRight());
            }

        }

        /*while (!out.isEmpty())
            System.out.print(out.pop()+",");*/
        return false;
    }

    private static void _deleteNode(BinaryTreeNode root, int data) {
        if (root == null)
            return;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            s.push(root);
            Stack<Integer> out = new Stack<>();
            while (!s.isEmpty()) {
                BinaryTreeNode temp = s.pop();
                if (temp != null) {
                    out.push(temp.getData());
                    if (data == temp.getData()) {
                        BinaryTreeNode deepest = _deepestNode(temp);
                        temp = deepest;
                    }
                    if (temp.getLeft() != null)
                        s.push(temp.getLeft());
                    if (temp.getRight() != null)
                        s.push(temp.getRight());
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop() + ", ");
        }
        System.out.println();

        //System.out.println(deepest);
        System.out.println();

    }

    private static BinaryTreeNode _deepestNode(BinaryTreeNode root) {
        if (root == null)
            return root;
        else {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            BinaryTreeNode prev = null;
            BinaryTreeNode temp = null;
            while (!q.isEmpty()) {
                prev = temp;
                temp = q.poll();
                if (temp != null) {
                    if (temp.getLeft() != null)
                        q.offer(temp.getLeft());
                    if (temp.getRight() != null)
                        q.offer(temp.getRight());
                }
            }
            return temp;
        }
    }

    private static void _levelOrder(BinaryTreeNode root) {
        if (root == null) return;
        else {
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> integers = new ArrayList<>();
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            while (!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if (temp != null) {
                    //System.out.print(temp.getData()+",");
                    integers.add(temp.getData());
                    if (temp.getLeft() != null)
                        q.offer(temp.getLeft());
                    if (temp.getRight() != null)
                        q.offer(temp.getRight());
                } else {
                    list.add(new ArrayList<>(integers));
                    integers.clear();
                    if (!q.isEmpty())
                        q.offer(null);
                }
            }
            System.out.println(list);
        }
    }

    private static void _inOrder(BinaryTreeNode root) {
        if (root == null) return;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            while (!s.isEmpty() || root != null) {
                if (root != null) {
                    s.push(root);
                    root = root.getLeft();
                } else {
                    BinaryTreeNode temp = s.pop();
                    System.out.print(temp.getData() + ",");
                    root = temp.getRight();
                }
            }
        }
    }

    private static void _postOrder(BinaryTreeNode root) {
        if (root == null) return;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            s.push(root);
            Stack<Integer> out = new Stack<>();
            while (!s.isEmpty()) {
                BinaryTreeNode temp = s.pop();
                if (temp != null) {
                    //System.out.print(+temp.getData()+",");
                    out.push(temp.getData());
                    if (temp.getLeft() != null)
                        s.push(temp.getLeft());
                    if (temp.getRight() != null)
                        s.push(temp.getRight());
                }
            }
            while (!out.isEmpty())
                System.out.print(out.pop() + ",");
        }
    }

    private static BinaryTreeNode _insertLevelOrder(BinaryTreeNode root, int data) {
        if (root == null) root = new BinaryTreeNode(data);
        else {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if (temp != null) {
                    if (temp.getLeft() != null)
                        q.offer(temp.getLeft());
                    else {
                        temp.setLeft(new BinaryTreeNode(data));
                        break;
                    }
                    if (temp.getRight() != null)
                        q.offer(temp.getRight());
                    else {
                        temp.setRight(new BinaryTreeNode(data));
                        break;
                    }
                }
            }
        }
        return root;
    }

    public static void _preOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        else {
            Stack<BinaryTreeNode> s = new Stack<>();
            s.push(root);
            while (!s.isEmpty()) {
                BinaryTreeNode temp = s.pop();
                if (temp != null) {
                    System.out.print(temp.getData() + ",");
                    if (temp.getRight() != null)
                        s.push(temp.getRight());
                    if (temp.getLeft() != null)
                        s.push(temp.getLeft());
                }
            }
        }
    }
}


