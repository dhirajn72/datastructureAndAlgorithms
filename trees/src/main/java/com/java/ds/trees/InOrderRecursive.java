/*Copyright (c) April 10, 2018 @DhirajSingh.
 * E-Mail           	: dhirajn72@gmail.com
 * Creation Date    	: 2018-04-10 03:15:46
 * Last modification	: 2018-04-10
               by		: Dhiraj Singh
 * Book Title			: Data Structures And Algorithms
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package com.java.ds.trees;

public class InOrderRecursive {
	public void InOrder(BinaryTreeNode root){
		if(root != null) {
			InOrder(root.getLeft());
			System.out.print(root.data+", ");
			InOrder(root.right);
		}
	}
}
