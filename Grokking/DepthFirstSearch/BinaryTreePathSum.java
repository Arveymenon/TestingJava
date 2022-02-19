package DepthFirstSearch;

import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class BinaryTreePathSum{
    public BinaryTreePathSum(){
        BinaryTree myTree = new BinaryTree(2);
        Node root = myTree.root;

        System.out.println(getPathSum(root, 11));
    }

    boolean getPathSum(Node node, int targetSum){
        if(node != null){
            if(getPathSum(node.left, targetSum - node.value)) return true;
            if(getPathSum(node.right, targetSum - node.value)) return true; 
            return false;
        }
        if(targetSum == 0){
            return true;
        }
        return false;
    }
}