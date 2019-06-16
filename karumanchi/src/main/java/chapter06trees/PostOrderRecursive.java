
package chapter06trees;

public class PostOrderRecursive {
	public void PostOrder(BinaryTreeNode root){
		if(root != null) {
			PostOrder(root.getLeft());
			PostOrder(root.right);
			System.out.println(root.data);
		}
	}
}
